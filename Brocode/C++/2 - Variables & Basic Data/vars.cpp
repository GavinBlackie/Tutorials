#include <iostream>

int main() {

    int x; // Declaration
    x = 7; // Assignment

    int y = 8;


    std::cout << x << std::endl;
    std::cout << y << std::endl;

    // Integers
    int age = 20;
    int year = 2025;
    int days = 8.6; // Truncated value (will assign 8)

    std::cout << age << std::endl;
    std::cout << year << std::endl;
    std::cout << days << std::endl;

    // Floats
    float gpa = 2.5;
    double price = 16.49;
    double temperature = 22.3;

    std::cout << gpa << std::endl;
    std::cout << price << std::endl;
    std::cout << temperature << std::endl;

    // Chars
    char grade = 'A';
    char initial = 'B';
    char currency = '$';

    std::cout << grade << std::endl;
    std::cout << initial << std::endl;
    std::cout << currency << std::endl;

    // Booleans (now built-in!) Note: lowercase true/false
    bool isStudent = true;
    bool isPowered = false;
    bool forSale = true;
    bool isRunning = false;

    // String (objects that are sequences of text)
    std::string name = "Gavin";
    std::string day = "Wednesday";
    std::string food = "Pizza";

    std::cout << "Hello, " << name << "!" << std::endl;
    std::cout << "You are " << age << " years old" << std::endl;

    return 0;
}