#include <iostream>

using namespace std;

// "CANNOT differentiate between funcs based on return type alone"
// think: compiler does not keep track of what type is expected
// for after-call-use by the caller!!!!

//int test() {}
//float test() {}

//void print(int);
//void print(int, int y=10);

int main() {

    // std::cin is ignored, and cpp attempts to do cin >> cin as
    // an int >> int, which defaults it to 0
    // THINK ABOUT SCOPES!!!!

    int cin;
    cin >> cin;
    cout << "cin: " << cin << std::endl;

    // Will output cin: 0 (or some other garbage value)

    int arr[5] = {2, 4, 7, 2, 9};
    int (&ref)[5] = arr;
    std::cout << ref << std::endl;



    return 0;
}

// "Ambiguous functions" -> compiler: which one do I call for print(5)????
// void print(int x){

// }

// void print(int x, int y=10){

// }