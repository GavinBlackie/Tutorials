#include <iostream>

void makeMeYoung(int*);

void actYourAge(int&);

int main() {

    int age = 20;
    int* ptr = &age;

    std::cout << "Address of pointer (ptr) = " << ptr << std::endl;

    std::cout << "Data at the ptr (*ptr) = " << *ptr << std::endl;

    int badNums[5] = {4, 5, 3, 1, 4};
    int* numArrPtr = badNums;

    std::cout << "Arr Address Value: " << *numArrPtr << std::endl;
    numArrPtr++;

    std::cout << "Arr Address Value: " << *numArrPtr << std::endl;
    std::cout << "Arr Address Value: " << *badNums << std::endl;

    makeMeYoung(&age);

    std::cout << "I am now " << age << " years old!" << std::endl;
   
    actYourAge(age);

    std::cout << "I am now " << age << " years old!" << std::endl;


    // Use pointers if you don't want to initialize immediately
    // Use references if you do want to initialize immediately

    return 0;
}

void makeMeYoung(int* age) {
    *age = 16;
}

void actYourAge(int& age) {
    age = 17;
}