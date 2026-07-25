#include <iostream>
#include <vector>
#include <string>
#include <fstream>
#include <iomanip>

typedef std::string string;

using std::setw;

int main() {

    //char numberGuessed[50];
    //std::string numberGuessed;
    string numberGuessed;
    int intNumberGuessed = 0;
    char* endPtr;

    do {

        std::cout << "Guess between 1 and 10: " << std::endl;

        std::cin >> setw(10) >> numberGuessed;

        //intNumberGuessed = std::strtol(numberGuessed, &endPtr, 10);

        intNumberGuessed = std::stoi(numberGuessed);

     } while (intNumberGuessed != 4);

    return 0;
}