#include <iostream>

int main() {

    // pointers = variable that stores a memory address of another var
    //            sometimes it's easier to work with an address
    
    // especially useful for avoiding by-value copies of large structs
    // or objects in function calls (alternative is references)

    // & address-of operator
    // * dereference operator
    // remember: RIGHT-to-left associativity for these operators

    // "its easier to tell people where the pizza is rather than 
    //  carry it around with you"

    std::string name = "";

    std::cout << "What is your name?: ";
    std::getline(std::cin, name);
    std::cout << "Your name is: " << name << std::endl;

    int age = 0;
    std::cout << "What is your age?: ";
    std::cin >> age;

    std::string *namePtr = &name;
    std::cout << "namePtr: " << namePtr << std::endl;
    std::cout << "*namePtr: " << *namePtr << std::endl;

    int *agePtr = &age;
    std::cout << "agePtr: " << agePtr << std::endl;
    std::cout << "*agePtr: " << *agePtr << std::endl;


    std::string freePizzas[5] = {"pizza1", "pizza2", "pizza3", "pizza4", "pizza5"};

    std::string *pFreePizzas = freePizzas;
    std::cout << pFreePizzas << std::endl;
    std::cout << *pFreePizzas << std::endl;
    std::cout << *(pFreePizzas+1) << std::endl;


    return 0;
}