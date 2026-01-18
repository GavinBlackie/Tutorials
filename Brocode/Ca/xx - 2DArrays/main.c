#include <stdio.h>
#include <stdlib.h>

void display2DArrayI(int**, int, int);
void display2DArrayC(char (*array)[50], int, int);

int main() {

    // 2D array = An array where each element is an array
    //           array[][] = {{}, {}, {}}
    //          -> In C, arrays of arrays are jagged, unlike C#

    int numbers[][4] = {{1, 2, 3}, 
                        {4, 5, 6}, 
                        {7, 8, 9},
                        {10, 11, 12, 13}};

    // corresponds to (1, 1), which is 5
    printf("%d\n", *(*(numbers+1)+1));
    
    printf("%d\n", numbers[2][2]); // prints 9

    printf("----------------\n");

    int rowMax = sizeof(numbers) / sizeof(numbers[0]);
    int colMax = sizeof(numbers[0]) / sizeof(int);

    // Experimenting with dynamic 2D heap arrays
    // NOTE: calloc makes data 0 by default
    int **numbersHeap = (int**)calloc(rowMax, sizeof(int*));
    for (int iRow=0; iRow < rowMax; iRow++){
        numbersHeap[iRow] = (int*)calloc(colMax, sizeof(int));
    }

    for (int iRow=0; iRow < rowMax; iRow++){
        for (int iCol=0; iCol < colMax; iCol++){
            numbersHeap[iRow][iCol] = iRow + iCol;
        }
    }

    // Will not work with numbers 
    // (2d arrays are NOT double pointers as they are stack-stored)
    // but will work with numbersHeap
    display2DArrayI(numbersHeap, rowMax, colMax);

    printf("----------------\n");

    // Printing out the regular 2D array
    for (int iRow=0; iRow < rowMax; iRow++) {
        for (int iCol=0; iCol < colMax; iCol++){
            //printf("%d " , *(*(numbers + iRow) + iCol) );

            // Treating numbers as a 1D array
            // (2D arrays are just row memory blocks beside one another)
            // which means that iRow * colMax gives the row offset, and
            // iCol is the relative offset inside that memory block
            printf("%d ", *(*numbers + iRow * colMax + iCol));
        }
        printf("\n");
    }

    printf("----------------\n");

    char numpad[][3] = {{'1', '2', '3'}, 
                        {'4', '5', '6'}, 
                        {'7', '8', '9'},
                        {'*', '0', '#'}};

    int numRowMax = sizeof(numpad) / sizeof(numpad[0]);
    int numColMax = sizeof(numpad[0]) / sizeof(char);

    for (int iRow=0; iRow < numRowMax; iRow++) {
        for (int iCol=0; iCol < numColMax; iCol++){
            printf("%c " , *(*(numpad + iRow) + iCol) );
        }
        printf("\n");
    }
}

void display2DArrayI(int** array, int rowMax, int colMax) {

    // printf("%p\n", array);
    // printf("%p\n", *(array + 1));
    // int a = array[0][0];
    // printf("%d\n", *(*(array + 1)));

    for (int iRow=0; iRow < rowMax; iRow++) {
        for (int iCol=0; iCol < colMax; iCol++){
            printf("%d " , *(*(array + iRow) + iCol) );
        }
        printf("\n");
    }
}

void display2DArrayC(char (*array)[50], int rowMax, int colMax) {
    for (int iRow=0; iRow < rowMax; iRow++) {
        for (int iCol=0; iCol < colMax; iCol++){
            printf("%d " , array[iRow][iCol]);
        }
        printf("\n");
    }
}