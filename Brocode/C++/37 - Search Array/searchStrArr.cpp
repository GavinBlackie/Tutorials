#include <iostream>
#include <cstring>

int searchArray(int[], int, int);
int searchArray(std::string[], int, std::string);

int main() {

    std::string foods[] = {"pizza", "hamburger", "hotdog", "ribs"};
    int size = sizeof(foods) / sizeof(int); // B / T = A
    int index = 0;

    std::string myFood;

    std::cout << "Enter element to search for: " << std::endl;
    //std::cin >> myNum;
    std::getline(std::cin, myFood);

    std::cout << std::cin.fail() << std::endl;

    //std::cout << foods[0].length();
    index = searchArray(foods, size, myFood);

    if (index != -1) {
        std::cout << myFood << " is at index " << index << std::endl;
    }
    else {
        std::cout << myFood << " is not in the array!" << std::endl;
    }

    return 0;
}

int searchArray(int arr[], int size, int element){
    for (int iArr = 0; iArr < size; iArr++) {
        if (arr[iArr] == element) {
            return iArr;
        } 
    }
    return -1;
}

int searchArray(std::string arr[], int size, std::string element) {
    for (int iArr = 0; iArr < size; iArr++) {
        if (arr[iArr].compare(element) == 0) {
            return iArr;
        } 
    }
    return -1;
}