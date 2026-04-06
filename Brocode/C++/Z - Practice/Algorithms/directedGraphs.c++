#include <iostream>
#include <vector>
#include <array>
#include <algorithm> // For the "count" search function
using namespace std;

// Represents a graph's node (using public: to save space)
class Node {
public:
    char data;
    vector<Node*> neighbours;
    Node(char data, vector<Node*> neighbours) {
        this->data = data;
        this->neighbours = neighbours;
    }
};

struct Edge {
    Node* u;
    Node* v;
    int weight;
};

void constructMST(vector<Edge> edges, vector<Edge> F);

// Prints the content of an Edge Vector
void printEdgeVector(vector<Edge> E) {
    cout << endl;
    for (int i = 0; i < E.size(); i++) {
        cout << E[i].u->data << ' ';
        cout << E[i].v->data << ' ';
        cout << ", weight: " << E[i].weight << ' ' << endl;
    }
}

// This returns a true or false value if an Edge vector contains a specific edge!
bool containsEdge(vector<Edge> E, Edge edge){
    for (int iVec = 0; iVec < E.size(); iVec++) {
        if (E[iVec].u == edge.u && E[iVec].v == edge.v)
            return true;
    }
    return false;
}

// Returns a true or false value if an Edge destination exists or not in an Edge vector
bool destExists(vector<Edge> E, Node* dest) {
    for (int iVec = 0; iVec < E.size(); iVec++) {
        if (E[iVec].u == dest || E[iVec].v == dest)
            return true;
    }
    return false;
}

int main() {
    Node* a = new Node('A', vector<Node*>());
    Node* b = new Node('B', vector<Node*>());
    Node* c = new Node('C', vector<Node*>());
    Node* d = new Node('D', vector<Node*>());
    Node* e = new Node('E', vector<Node*>());
    Node* f = new Node('F', vector<Node*>());
    Node* g = new Node('G', vector<Node*>());

    a->neighbours.push_back(b);
    b->neighbours.push_back(a);

    // Need edges and their weights
    vector<Edge> edges = { {a, b, 2}, {a, c, 3}, {a, d, 3}, {b, c, 4}, {b, e, 3}, {c, e, 1}, {c, d, 5}, {d, f, 7}, {e, f, 8}, {f, g, 9} };

    vector<Edge> F = { edges[0], edges[1] };

    constructMST(edges, F);

    return 0;
}

// A practice insertionSort I made on my own previously that I will use!
// It has been customized to also adjust the edge vector accordingly!
void insertionSort(vector<Edge>& edges) {
    // Insertion Sort:
    //              Stable => equal elements retain their order
    //              In-Place (if done right) => no extra memory required
    // SORTED portion + UNSORTED portion !!
    for (int iArr = 1; iArr < edges.size(); iArr++) {
        Edge keyElem = edges[iArr];
        int jArr = iArr - 1;    // Keeps track of immediate element before (the one in the SORTED portion)
        Edge prevElem = edges[jArr];

        // Converted loop to use weight attributes of the Edge struct!!!!!
        while (keyElem.weight < prevElem.weight && jArr >= 0) {
            // Shift
            edges[jArr + 1] = prevElem;
            jArr--;
            prevElem = edges[jArr];
        }
        edges[jArr + 1] = keyElem;
    }
}

void constructMST(vector<Edge> E, vector<Edge> F) {
    vector<Edge> X = vector<Edge>();

    // Add all "F" edges to X
    for (int iF = 0; iF < F.size(); iF++) {
        X.push_back(F[iF]);
    }

    // Sort edges by their weights (Sorting algorithm used doesn't matter)
    insertionSort(E);
    cout << "Edges After Sorting!: ";
    printEdgeVector(E);

    // for all edges,
    for (int iEdge = 0; iEdge < E.size(); iEdge++) {
        Edge edge = E[iEdge];

        // // If that edge is not covered and causes no cycles,
        // // https://www.geeksforgeeks.org/cpp/check-if-vector-contains-given-element-in-cpp/ <- reference used to check if vector contains something
        if ( containsEdge(X, edge) == false
            &&
            destExists(X, edge.v) == false // If the destination is not in X, then it will not cause a cycle
            ){

            // Add that edge to X!
            X.push_back(edge);
        }
    }
    // Print out final MST
    cout << "\nFound MST: ";
    printEdgeVector(X);
}