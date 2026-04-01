#include <stdio.h>
#include <stdbool.h>

int* bubbleSort(int* arr, int n);

int main() {
    int myArr[] = {1, 2, 3, 4, 5, 6};
    int myArrSize = 6;

    bubbleSort(myArr, myArrSize);

    for (int iArr = 0; iArr < myArrSize; iArr++) {
        printf("%d ", myArr[iArr]);
    }
    printf("\n");

    int myArr2[] = {6, 5, 4, 3, 2, 1};
    int myArr2Size = 6;
    bubbleSort(myArr2, myArr2Size);

    for (int iArr = 0; iArr < myArr2Size; iArr++) {
        printf("%d ", myArr2[iArr]);
    }

    return 0;
}

int* bubbleSort(int* arr, int n) {
    // Bubble is Stable => equal values have 0 chance of swapping
    // Bubble is In-Place => no extra memory req
    // O(n^2)

    // Iterate every element (full pass = sorted)

    for (int iArr = 0; iArr < n-1; iArr++) {
        bool swapped = false;

        // Iterate element again
        for (int jArr = 0; jArr < n-1-iArr; jArr++) {
            // If the element to the right is smaller, swap them
            if (arr[jArr] > arr[jArr + 1]) {
                int temp = arr[jArr];
                arr[jArr] = arr[jArr+1];
                arr[jArr+1] = temp;

                swapped = true;
            }
        }

        // Break early if a full pass succeeds
        if (swapped == false) {
            break;
        }
    }

    return arr;
}