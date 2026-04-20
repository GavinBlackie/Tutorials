#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

// "functions are just an address in memory",
// they refer to a block of dedicated instructions
int foo(int x, int y) {
    return x + y;
}

bool isOdd(int x) {
    return x % 2 == 1;
}
bool isEven(int x) {
    return x % 2 == 0;
}

// Example: using a callback function
// The predicate is a function that takes an integer,
// and returns a boolean value
void print_if(int arr[], bool (*predicate)(int), const char msg[10]) {
    for (int iArr = 0; iArr < 10; iArr++) {
        if (predicate(arr[iArr]) == true) 
            printf("%s : %d\n", msg, arr[iArr]);
    }
}

int main(void) {
    int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int (*func)(int, int) = foo; // Function type

    // Calling the function type
    printf("Calling func type: %d\n\n", func(1, 4) );

    printf("--- Odd Numbers in Arr ---\n");
    print_if(nums, isOdd, "Odd Num");
    printf("--------------------------\n\n");
    
    printf("--- Even Numbers in Arr ---\n");
    print_if(nums, isEven, "Even Num");
    printf("--------------------------\n\n");

    // "man qsort" <= C libraries are in linux OS !!!
    // qsort is the C implementation of QuickSort!!

    

    return 0;
}