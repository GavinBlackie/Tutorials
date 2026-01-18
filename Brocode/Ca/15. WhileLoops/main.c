#include <stdio.h>
#include <string.h>

int main() {
    // while loop = Continuing block of code WHILE a true/false statement
    //              remains true. Can also break or continue prematurely
    //              using respective keywords.

    int number = 1;

    while (number <= 0) {
        printf("Enter a number greater than 0: ");
        scanf("%d", &number);
    }

    // do {
    //     printf("Enter a number greater than 0: ");
    //     scanf("%d", &number);
    // } while (number <= 0);

    char name[50] = "";

    printf("Enter your name: ");
    fgets(name, sizeof(name), stdin);
    name[strlen(name) - 1] = '\0';

    while (strlen(name) == 0) {
        printf("Name cannot be empty! Please reenter your name: ");
        fgets(name, sizeof(name), stdin);
        name[strlen(name) - 1] = '\0';
    }
}