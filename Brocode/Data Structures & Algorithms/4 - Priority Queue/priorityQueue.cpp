// Useful reference website(s):
// https://www.geeksforgeeks.org/cpp/priority-queue-in-cpp-stl/
//
// https://devdocs.io/cpp/container/priority_queue
// "Logarithmic Insertion and Extraction"

#include <iostream>
#include <queue>
using std::cout, std::cin, std::priority_queue, std::endl;

int main() {

    priority_queue<char> grades;

    grades.push('D');
    grades.push('B');
    grades.push('A');
    grades.push('A');
    grades.push('C');

    // Emptying the queue in order!
    // "FIFO" => A, A, B, C, D
    while (!grades.empty()) {
        cout << grades.top() << ", ";
        grades.pop(); // must call pop seperately in C++
    }

    cout << "\n\n*****************\n\n";

    priority_queue<int> nums;
    nums.push(3);
    nums.push(4);
    nums.push(2);
    nums.push(1);
    nums.push(7);
    nums.push(5);
    
    // Predicted: 7, 5, 4, 3, 2, 1
    nums.pop();
    cout << nums.top() << endl; // 5
    cout << "SIZE: " << nums.size() << endl; // 5
    nums.pop();
    nums.pop();
    nums.pop();
    cout << nums.top() << endl; // 2
    cout << "SIZE: " << nums.size() << endl; // 2

    cout << "\n\n*****************\n\n";


    // "makes a min heap" => makes order by smallest-to-largest
    priority_queue<int, std::vector<int>, std::greater<int>> pQ;
    pQ.push(14);
    pQ.push(4);
    pQ.push(10);
    pQ.push(1);
    pQ.push(7);
    // 1, 4, 7, 10, 14
    pQ.pop();
    cout << pQ.top() << endl; // 4
    pQ.pop();
    cout << pQ.top() << endl; // 7
    pQ.pop();
    pQ.pop();
    cout << pQ.top() << endl; // 14
    pQ.pop();
    pQ.pop();
    pQ.pop();
    pQ.pop();
    cout << pQ.top() << endl;
    cout << "SIZE: " << pQ.size() << endl;
    // UNDEFINED BEHAVIOUR HAPPENS!!!!
    // (when popping too much)

}