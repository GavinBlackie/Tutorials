#include <stdio.h>
#include <stdlib.h>

void displayArrayF(float*, int);
void obtainArrayF(float*, int);

int main() {

    // realloc() = Reallocation.
    //             Resizes the previously allocated memory
    //             realloc(ptr, bytes)
    
    // VERY SIMILAR/TO DO WITH DYNAMIC LISTS

    unsigned int number = 0;
    printf("Enter the number of prices: ");
    scanf("%d", &number);


    // USE O.V.A.C. function creation process

    // 1. Obtain
    // Dynamically allocate some space
    float *prices = (float*)calloc(number, sizeof(float));

    // 2. Valdiate
    // AVOID SEGMENTATION FAULT
    if (prices == NULL){
        printf("Memory allocation failed!\n");
        return 1;
    }

    // 3. Act
    // Obtain the values from user
    displayArrayF(prices, number);
    obtainArrayF(prices, number);
    displayArrayF(prices, number);

    // Optional reallocation
    // Get a new size
    int newNumber = 0;
    printf("Enter a new number of prices: ");
    scanf("%d", &newNumber);

    // Get a temp reallocation (obtain)
    float *temp = (float*)realloc(prices, newNumber * sizeof(float));
    
    // Avoid segmentation fault (validation)
    if (temp == NULL) {
        printf("Could not reallocate memory!\n");
        // Don't need to return if you don't want to exit
    } else {
        // Copy over contents (copy the address)
        prices = temp;

        // Get new values
        obtainArrayF(prices, newNumber);

        // Display back to user
        displayArrayF(prices, newNumber);
    }
    // Free the appartment space and return keys of temp
    free(temp);
    temp = NULL;
    


    // 4. Clean Up
    // "Return the appartment & keys once done"
    free(prices);
    prices = NULL;

    return 0;
}

void displayArrayF(float *ptr, int size){
    for (int iArray=0; iArray < size; iArray++){
        printf("%.2f\n", *(ptr + iArray));
    }
}

void obtainArrayF(float *ptr, int size){
    for (int iArray=0; iArray < size; iArray++){
        printf("Enter the #%d number: ", iArray+1);
        scanf("%f", ptr+iArray);
    }
}