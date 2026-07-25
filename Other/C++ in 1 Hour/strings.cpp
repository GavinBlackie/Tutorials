#include <iostream>
#include <string>
#include <iomanip> // I/O MANIPulators

int main() {

    char happyArray[6] = {'H', 'A', 'P', 'P', 'Y', '\0'};
    std::string birthdayStr = " Birthday";

    // String concatenation
    std::cout << happyArray + birthdayStr << std::endl;

    std::string name;
    std::cout << "What is your name?: ";
    std::getline(std::cin, name);
    // std::cin >> std::setw(10) >> name;
    // std::cin.clear();

    std::cout << "Hello " << name << std::endl;
    std::cout << std::flush;

    double e = .57721;
    std::string eulerGuess;
    double eulerGuessDouble;

    std::cout << "What is Euler's Constant?: " << std::flush;
    //std::getline(std::cin, eulerGuess);

    std::cin >> std::setw(10) >> eulerGuess;
    std::cin.clear();

    eulerGuessDouble = std::stod(eulerGuess);

    if (eulerGuessDouble == e) {
        std::cout << "You are correct! " << std::endl;
    } else {
        std::cout << "You are wrong. " << std::endl;
    }

    // .size() -> gives the size of that string
    std::cout << "Size of String: " << eulerGuess.size() << std::endl;
    // .empty() -> returns true/false if string is empty or not; ""
    std::string emptyStr = eulerGuess.empty() ? "yes" : "no";
    std::cout << "Is string empty?: " << emptyStr << std::endl;
    // .append() -> adds a string to end
    std::cout << eulerGuess.append(" was your guess.") << std::endl;


    // String comparisons (-1, 0, 1) -1 if < than, 0 if equal, 1 if > than
    std::string bananaStr = "Banana";
    std::string appleStr = "Apple";

    std::cout << bananaStr.compare(appleStr) << std::endl;
    std::cout << bananaStr.compare(bananaStr) << std::endl;
    std::cout << appleStr.compare(bananaStr) << std::endl;
    
    // Assign gives an expression of that string, for that range,
    // but will change the string acting "the str.assign one"
    // std::string temp = temp.copy(appleStr, 5);
    std::string fritter = appleStr.assign(appleStr, 0, 5);
    std::cout << fritter << std::endl;
    std::cout << appleStr << std::endl;


    fritter.insert(5, "Rigatoni");
    

    return 0;
}