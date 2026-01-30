#include <iostream>
#include <string>

int main() {

    std::string name;
    
    std::cout << "Enter your name: ";
    std::getline(std::cin, name);

    // The length function
    if (name.length() > 12) {
        std::cout << "Your name cannot be more than 12 chars" << std::endl;
    }
    else {
        std::cout << "Welcome " << name << std::endl;
    }

    // Find -> finds the first index of a char or set of chars
    size_t a = name.find(' ');
    
    if ( a != std::string::npos) {
        std::cout << a << std::endl;
        name.erase(a, 1); // Erase -> erase at a char for n times afterwards
    }

    // clear -> clears the string
    // name.clear()

    // Empty -> bool if that string exists or not
    if (name.empty()) {
        std::cout << "You did not enter your name!" << std::endl;
    } else {
        std::cout << "Hello " << name << std::endl;
    }

    // Append -> add to the end of a string
    name.append("@gmail.com");
    std::cout << "Your username is now: " << name << std::endl;

    unsigned int chNum = 0;
    std::cout << "Char at: " << chNum << " is: "<< name.at(0) << std::endl;

    // Insert -> insert a char at a specific place in string
    // note: insert shifts characters/doesn't replace
    name.insert(0, "B");
    std::cout << "Your username is now: " << name << std::endl;

    // at -> gives char at specific index
    std::cout << name.at(0) << std::endl;

    size_t b = 1;
    name.replace(1, 3, "AAA");
    std::cout << "Your username is now: " << name << std::endl;

    return 0;
}