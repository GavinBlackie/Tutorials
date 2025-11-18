#include <iostream>
#include <vector>
#include <string>
#include <fstream>

int main() {

    int randNum = (std::rand() % 100) + 1;

    while (randNum != 100) {
        std::cout << randNum << ", ";
        randNum = (rand() % 100) + 1;
    }

    return 0;
}