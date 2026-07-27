#include <stdio.h>

// O(n^2)
int removeDuplicates(int* nums, int numsSize) {
    int k = 0;
    // Iterate over every ith element
    for (int iNum = 0; iNum < numsSize; iNum++) {
        char iExists = 'F';
        // Search between j and k for the "ith" element if it exists
        for (int jNum = 0; jNum < k; jNum++) {
            if ( *(nums+iNum) == *(nums+jNum) ) {
                iExists = 'T';
                break;
            }
        }

        // If a duplicate was not found, place it in the non-duplicate, "k", section of the array
        if (iExists == 'F') {
            nums[k] = nums[iNum];
            k++;
        } 
    }

    return k;
}

int main() {

    int numsTest1[] = {1, 1, 2};
    printf("%d\n", removeDuplicates(numsTest1, 3));

    int numsTest2[] = {0, 0, 0, 1, 2, 4, 5, 6, 7, 8, 8, 9, 9, 9, 9, 17};
    printf("%d\n", removeDuplicates(numsTest2, 16));

    return 0;
}