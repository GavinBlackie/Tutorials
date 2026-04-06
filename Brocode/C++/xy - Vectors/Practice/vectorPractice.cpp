#include <iostream>
#include <vector>

using std::vector;
using std::cout;
using std::cin;
using std::endl;

template<typename T>
void printVector(vector<T>);

int main() {

    // Some vector of integers!
    vector<int> dimensions = {3, 8, 6};

    // Basic display
    for (int iVec=0; iVec < dimensions.size(); iVec++) {
        cout << dimensions.at(iVec) << " ";
    }
    cout << endl;
    
    // Using my custom printVector function!
    printVector(dimensions);

    dimensions.push_back(11); // Adding a single num, 11

    // Adding 0 through 9 to the vector!
    int counter = 0;
    while (counter < 10) {
        dimensions.push_back(counter); 
        counter ++;
    }
    
    printVector(dimensions);

    dimensions.erase(dimensions.begin() + 1); // Delete the second element

    printVector(dimensions);

    counter = 4;
    do {
        dimensions.erase(dimensions.begin());
        counter--;
    } while (counter > 0);

    printVector(dimensions);

    return 0;
}

// I accidentally discovered how to do docstrings in C++!:

/// @brief Prints the contents of a vector
/// @tparam T Generic type that the vector contains
/// @param vec the vector to be displayed
template<typename T>
void printVector(vector<T> vec) {
    cout << "[";
    for (int iVec=0; iVec < vec.size(); iVec++) {
        cout << vec.at(iVec) << ", ";
    }
    cout << "\b\b]" << endl;
}