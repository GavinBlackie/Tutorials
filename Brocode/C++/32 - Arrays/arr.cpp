#include <iostream>

int main() {

    // array = data structure holding multiple values.
    //         It is a compound data type stored in the stack,
    //         and values are accessed by index number

    std::string cars[] = {"Mustang", "Krabby Pattie Mobile",
                        "Batman Motorcycle", "Lambo", 
                        "Corvette"};
    
    // In C:
    // B / T = A
    int size = sizeof(cars) / sizeof(std::string);

    // In C++:
    //int size = sizeof(cars);

    for (int iCar = 0; iCar < size; iCar++) {
        std::cout << cars[iCar] << std::endl;
    }

    float scores[4];
    scores[0] = 32.43;
    scores[1] = 54.46;
    scores[2] = 9.404;
    scores[3] = 0.234;


    return 0;
}