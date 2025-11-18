#include <iostream>

// Still need function prototypes (for using in main/before definition)
// happyBirthday can still be declared and defined here though
void happyBirthday(std::string, int);

int main() {

    int a[5] = {2, 4, 3, 1, 0};
    std::cout << sizeof(a) << std::endl;


    // function = a block of resusable code

    std::string name = "Gavin";
    auto age = 20;

    happyBirthday(name, age);
    happyBirthday(name, age);
    happyBirthday(name, age);

    return 0;
}

void happyBirthday(std::string birthdayBoi, int birthAge) {
    std::cout << "Happy Birthday to " << birthdayBoi << "!" << std::endl;
    std::cout << "Happy Birthday to " << birthdayBoi << "!" << std::endl;
    std::cout << "Happy Birthday dear " << birthdayBoi << "!" << std::endl;
    std::cout << "Happy Birthday to " << birthdayBoi << "!" << std::endl;
    std::cout << "You are: " << birthAge << " years old!\n" << std::endl;
}