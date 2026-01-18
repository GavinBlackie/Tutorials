#include <stdio.h>
#include <string.h> // Has strcpy
#include <stdlib.h> // for malloc

int main() {

    const char arr[] = "Spongebob Squarepants";
    int arrSize = sizeof(arr) / sizeof(int); // B/T = A

    printf("%s\n", arr);

    char sponge[30];
    strcpy(sponge, arr); // Copies the WHOLE array

    printf("%s\n", sponge);

    char* bob;
    bob = (char*) malloc(10 * sizeof(char));

    memcpy(bob, arr, 9);
    memset(bob+9, 0, 1);

    printf("%s\n", bob);
    printf("%zu\n", strlen(bob));
    free(bob);

    char pat[] = "Patrick Star";

    // use memset to set an area of memory to something!
    memset(pat+7, '\0', 4);

    printf("%s\n", pat);

    return 0;
}