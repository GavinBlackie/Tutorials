#include <iostream>
#include <vector>
#include <string>
#include <fstream>

int main() {

    int nums[5];

    int badNums[5] = {5, 9, 7, 3, 2};

    std::cout << "Bad Number 1: " << badNums[0] << std::endl;

    std::cout << sizeof(badNums) << std::endl;

    // Multi dimensional arrays

    char myName[2][8] = { {'G', 'a', 'v', 'i', 'n'}, 
                          {'B', 'l', 'a', 'c', 'k', 'i', 'e'}};

    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 8; j++) {
            char ch = myName[i][j];
            if (ch != '\0') {
                std::cout << ch;
            }
        }
        std::cout << std::endl;
    }


    return 0;
}