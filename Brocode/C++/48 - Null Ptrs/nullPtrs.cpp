#include <iostream>
//#include <cstdlib> // for malloc, calloc, realloc, and free (from C)
#include <new> // for bad_alloc exceptions

int main() {

    // Null value = a special value with no meaning
    //              
    //              When a ptr is null it holds nothing
    //              (and thus, has 0 chance of a hanging value!)

    // nullptr = keyword representing a null pointer literal

    // nullptrs are helpful when determining if an address
    // was successfully assigned to a ptr

    //int *ptr;
    int *ptr = nullptr; // Better practice!

    int x = 1234;

    //ptr = &x;

    // or ptr == NULL
    if (ptr == nullptr){
        std::cout << "address was not assigned!" << std::endl;

        // undefined behaviour (can result in segmentation fault)
        //std::cout << *ptr << std::endl;
    }
    else {
        std::cout << "address was assigned!" << std::endl;
        std::cout << *ptr << std::endl;
    }

    try{
        float *floatPtr = new float[5];
    }
    catch (std::bad_alloc &ex){
        std::cerr << "memory allocation failed!" << std::endl;
    }

    return 0;
}