#include <iostream>

int main() {

    // dynamic memory = Memory allocated after program
    //                  already compiles & runs.
    //                  Unlike C with malloc, calloc, and
    //                  realloc, we just use "new" keyword
    //                  that allocates memory for you

    // Is useful when we don't know how much memory is
    // needed (IS a PRIMARY principle behind data
    // structures).

    // Makes programs flexible, especially when accepting
    // user input.

    int *pNum = NULL;

    // pNum = (int*)malloc(1 * sizeof(int)); // In C
    pNum = new int; // in C++

    *pNum = 21;

    std::cout << "Address: " << pNum << std::endl;
    std::cout << "Value: " << *pNum << std::endl;

    // In C
    // free(pNum);
    // pNum = NULL;

    // In C++
    delete pNum;

    return 0;
}