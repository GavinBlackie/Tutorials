#include <iostream>

int main() {
    const double PI = 3.14159;
    // PI = 420.69;
    const int WIDTH = 1920;
    const int HEIGHT = 1080;

    double radius = 10;
    double circumference = 2 * PI * radius;
    std::cout << circumference << "cm²" << std::endl;


    // A constant integer pointer
    const int * x = &WIDTH;
    //*x = 12; // Can't modify the value of x (readonly)

    std::cout << x << std::endl;

    // A double pointer constant 
    // (a constant pointer to a double)
    double *const y = &radius;
    // y = &circumference; // Can't assign pointer again

    // A constant double pointer constant
    // Neither the pointer, nor the value can be changed
    const double * const h = &circumference;
    //*h = 5;
    //h = &radius;

    return 0;
}