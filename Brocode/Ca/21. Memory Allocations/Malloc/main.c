#include <stdio.h>
#include <stdlib.h>

int main() {

    // malloc() = A function in C that dynamically allocates
    //            a specified number of bytes in memory (size_t)

    // Arrays are fixed in size, malloc allows for dynamic lists
    // and more advanced Data Structures

    //char grades[5] = {0}; // fixed size array

    int number = 0;
    printf("Enter the number of grades: ");
    if (!scanf("%d", &number)){
        return -1;
    }

    // Malloc will return NULL (0) if a space cannot be assigned
    char *grades = (char*)malloc(number * sizeof(char)); 

    // De-referencing a null pointer will cause a segmentation fault
    // (Accessing a location it is not allowed to access, read or write to)
    if (grades == NULL) {
        printf("Memory allocation failed!\n");
        return -1;
    }

    // Generating elements of heap array
    for (int i = 0; i < number; i++){
        printf("Enter grade #%d: ", i+1);
        scanf(" %c", &grades[i]); // Avoid whitespace/newspace chars in buffer with a space before %c
    }

    // Printing elements of heap array
    for (int i = 0; i < number; i++) {
        printf("%c ", *(grades+i));
    }



    free(grades); // returning the "rented" space back to OS
    grades = NULL; // avoids "dangling pointers" - returning the key to appartment

    return 0;
}