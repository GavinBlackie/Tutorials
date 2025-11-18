#include <iostream>

int main() {

    char *pGrades = NULL;
    int size;

    std::cout << "How many grades to enter in?: ";
    std::cin >> size;

    // pGrades = (char*)calloc(size, sizeof(char));

    pGrades = new char[size];

    for (int i = 0; i < size; i++) {
        std::cout << "Enter grade #" << i + 1 << ": ";
        std::cin >> pGrades[i];
    }

    for (int i = 0; i < size; i++) {
        std::cout << pGrades[i] << " ";
    }

    // free(pGrades);

    delete[] pGrades;
    pGrades = NULL;

    return 0;
}