#include <stdio.h>
#define CHAR_BYTES 1
#define INT_BYTES 4
#define FLOAT_BYTES 4
#define DOUBLE_BYTES 8

// cannot do this, since arrays decay into pointers
// that can't use sizeof
// size_t lenf(float[]);

// size_t lenc(char[]);

int main() {

    // array = A fixed-size collection of elements of the same data type
    //          (Similar to a variable, but holds more than 1 value)
    //         (An array name is kindof like a var name, but referencing the whole collection)
    //          
    //         **an array name is a constant pointer**

    int numbers[4] = {10, 12, 42, 4583}; // numbers[4] ignores the last element, only takes what is needed
    int (*B)[4]; // Integer array size 4 is value pointed by B
    B = &numbers; // B is assigned to numbers' address
    
    //unsigned int uNumbers[] = {123, 4365, 345};
    float gpas[] = {2.3456456, 3.645645644, 4.023424, 1.22344};
    char grades[] = {'A', 'B', 'C', 'D', 'F'};
    char name[] = "Gavin";

    size_t a = sizeof(grades);
    size_t b = sizeof(grades[0]);
    int sizeGrades = a / b;

    unsigned long c = sizeof(gpas); // The size of the array in bytes
    unsigned long d = sizeof(gpas[0]); // The size of 1 element in array in bytes
    int sizeGpas = c / d;
    
    //printf("%d", numbers);// printing an array "decays" it into a pointer

    for (int i = 0; i < sizeGrades; i++){
        printf("%c ", grades[i]);
    }
    for (int i = 0; i < sizeGpas; i++){
        printf("%f ", gpas[i]);
    }
    //int b = lenf(gpas);
    //lenc(grades);
    
    printf("\n");
    printf("%c", name[0]);
    printf("%c", name[1]);
    printf("%c", name[2]);
    printf("%c", name[3]);
    printf("%c", name[4]);

    printf("%d", numbers[4]);

    return 0;
}
