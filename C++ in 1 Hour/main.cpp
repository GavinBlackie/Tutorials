#include <iostream>
#include <vector>
#include <string>
#include <fstream>

// using namespace std;
// g++ -std=c++11 main.cpp

int main() {

    // :: is the Scope Resolution Operator
    // << insertion operator
    // >> extraction operator

    std::cout << "Hello world!" << std::endl;

    // Variables
    const double PI = 3.1415926535;
    char grade = 'A';
    bool isHappy = true; // or false (lowercase)

    char name[] = "Gavin";
    
    float favNum = 34.4535;
    double otherFavNum = 2345345.4356536;

    std::cout << "Favourite Number: " << favNum << std::endl;


    size_t intSize = sizeof(int);

    std::cout << "Size of int: " << sizeof(int) << std::endl;


    // Operators
    // + - * / %    (Int division implicit, no power op)

    std::cout << "7 + 3 = " << 7 + 3 << std::endl;
    std::cout << "7 - 3 = " << 7 - 3 << std::endl;
    std::cout << "7 * 3 = " << 7 * 3 << std::endl;
    std::cout << "7 / 3 = " << 7 / 3 << std::endl;

    // Note: casting a number to get float division!
    std::cout << "7 / 3 = " << (double)7 / 3 << std::endl;
    std::cout << "7 % 3 = " << 7 % 3 << std::endl;

    // Incrementors
    unsigned int num = 5;

    std::cout << "num++ = " << num++ << std::endl;
    std::cout << "++num = " << ++num << std::endl;
    std::cout << "num-- = " << num-- << std::endl;
    std::cout << "--num = " << --num << std::endl;

    num += 5; num = num + 5;

    // Comparisons
    // ==, !=, >, <, >=, <=
    // Logical Operators
    // && || !

    int age = 80;
    int ageAtLastExam = 23;
    bool isStudent = false;
    bool isIntoxicated = false;

    if ( (age >= 1) && (age < 16) ) {
        std::cout << "You cannot drive - too young!" << std::endl;
    } else if (isIntoxicated) {
        std::cout << "You cannot drive - are drunk!" << std::endl;
    } else if ( age >= 80 && (age > 100 || (age - ageAtLastExam) > 5 )) {
        std::cout << "You cannot drive" << std::endl;
    } else {
        std::cout << "You can drive!" << std::endl;
    }

    int greetingOption = 2;

    switch (greetingOption) {
        case 1:
            std::cout << "Bonjour" << std::endl;
            break;
        case 2:
            std::cout << "Hola" << std::endl;
            break;
        case 3:
            std::cout << "Hallo" << std::endl;
            break;
        default:
            std::cout << "Hello" << std::endl;
            break;
    }


    return 0;
}