#include <iostream>
#include <string> // getline is in the string header!!!

// cout << (insertion operator)
// cin >> (extraction operator)

int main() {

    std::string name;
    unsigned short age;

    std::cout << "What's your age?: ";
    std::cin >> age;

    std::cout << "What's your full name?: ";
    //std::cin >> name;

    // Now we can get full names with spaces!
    std::getline(std::cin >> std::ws, name);

    std::cout << "Hello, " << name << std::endl;
    std::cout << "You are " << age << " years old!";

    return 0;
}