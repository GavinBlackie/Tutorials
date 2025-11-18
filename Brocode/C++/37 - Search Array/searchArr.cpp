#include <iostream>

int searchArray(int[], int, int);

int main() {

    int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int size = sizeof(numbers) / sizeof(int); // B / T = A
    int index = 0;

    int myNum = 0;

    std::cout << "Enter element to search for: " << std::endl;
    std::cin >> myNum;
    std::cout << std::cin.fail() << std::endl;

    index = searchArray(numbers, size, myNum);

    if (index != -1) {
        std::cout << myNum << " is at index " << index << std::endl;
    }
    else {
        std::cout << myNum << " is not in the array!" << std::endl;
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