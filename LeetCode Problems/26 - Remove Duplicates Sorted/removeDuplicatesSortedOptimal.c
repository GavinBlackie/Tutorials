#include <stdio.h>

// O(n)
int removeDuplicates(int* nums, int numsSize) {
    int iNum = 1;
    // Iterate over every ith element
    for (int jNum = 1; jNum < numsSize; jNum++) {
        // if the num at j doesn't equal the i number,
        if (nums[jNum] != nums[iNum - 1]) {
            nums[iNum] = nums[jNum];
            iNum++;
        } 
    }

    return iNum;
}

int main() {

    int numsTest1[] = {1, 1, 2};
    printf("%d\n", removeDuplicates(numsTest1, 3));

    int numsTest2[] = {0, 0, 0, 1, 2, 4, 5, 6, 7, 8, 8, 9, 9, 9, 9, 17};
    printf("%d\n", removeDuplicates(numsTest2, 16));

    return 0;
}