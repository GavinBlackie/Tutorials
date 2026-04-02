#include <stdio.h>

int* insertionSort(int*, int);

int main(void) {

    int grades[] = {4, 6, 2, 1, 7, 3};
    int SIZE = 6;

    insertionSort(grades, SIZE);

    for (int iArr = 0; iArr < SIZE; iArr++) {
        printf("%d ", grades[iArr]);
    }

    return 0;
}

int* insertionSort(int* arr, int n) {
    // Insertion Sort:
    //              Stable => equal elements retain their order
    //              In-Place (if done right) => no extra memory required

    // SORTED portion + UNSORTED portion !!

    // 1st pass: [4, | KEY = 6, 2, 7, 3]
    //           [4, 6, | 2, 7, 3]  (6 > 4, so no shift happens - already "sorted")
    // 2nd pass: [2, >>> 4, 6, | 7, 3] (2 < 6, shift happens in sorted part)
    // 3rd pass: [2, 4, 6, 7, | 3] (7 > 6, no shift happens)
    // 4th pass: [2, 3, >>> 4, 6, 7] (3 < 7, shift will happen)
    // Final result: [2, 3, 4, 6, 7]

    for (int iArr = 1; iArr < n; iArr++) {
        int keyElem = *(arr + iArr);
        int jArr = iArr - 1;    // Keeps track of immediate element before (the one in the SORTED portion)
        int prevElem = *(arr + jArr);

        printf("Key: %d\n", keyElem);

        // If keyElem is less than prevElem, it is not sorted,
        // try to shift the sorted elements however many times are necessary.
        // This looks at the elements to shift going in the LEFT direction instead of right!
        while (keyElem < prevElem && jArr >= 0) {
            
            // Shift
            arr[jArr + 1] = prevElem;
            jArr--;
            prevElem = *(arr + jArr);
        }
        arr[jArr + 1] = keyElem;
    }

    return arr;
}