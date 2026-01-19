#include <stdio.h>
#include <stdlib.h>

void displayArrayI(int*, int);
void obtainArrayI(int*, int);

int main(){

    // calloc = Contiguous Allocation. (Clear Allocation)
    //          Allocates memory dynamically and sets all allocated bytes to 0. (unlike malloc)
    //          malloc is faster, but calloc leads to less bugs
    //          calloc (# of times, size)

    // REMEMBER FORMULA: Array Byte Size / Type byte size of 1 element = Array Numeric Size

    unsigned int number = 0;
    printf("Enter the number of players: ");
    scanf("%u", &number);

    // Will give an allocated heap space, but will NOT be all 0 values
    // (The appartment will not be cleaned)
    //int *scores = (int*)malloc(number * sizeof(int));

    // Contiguous allocation (all bytes set to 0 initially)
    int *scores = (int*)calloc(number, sizeof(int));

    
    // Avoid segmentation faults
    if (scores == NULL){
        printf("Memory allocation failed!!!");
        return -1;
    }

    // for (int i = 0; i < number; i++){
    //     printf("%d ", *(scores + i));
    // }

    // Initially display heap array (should be all 0s with calloc)
    displayArrayI(scores, number);

    // Now ask user for some input for the array!
    obtainArrayI(scores, number);

    // Display array after the user has inputted the data!
    // (use the data!!!)

    displayArrayI(scores, number);


    free(scores); // "Leave the appartment after renting"
    scores = NULL; // "Give back the keys to the appartment"

}

void displayArrayI(int *ptr, int size){
    for (int iArray=0; iArray < size; iArray++){
        printf("%d\n", *(ptr + iArray));
    }
}

void obtainArrayI(int *ptr, int size){
    for (int iArray=0; iArray < size; iArray++){
        printf("Enter the #%d number: ", iArray+1);
        scanf("%d", ptr+iArray);
    }
}