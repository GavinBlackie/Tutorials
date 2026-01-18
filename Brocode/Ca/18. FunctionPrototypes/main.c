#include <stdio.h>
#include <stdbool.h>

void hello(char[], int);

bool ageCheck(int);

int main() {

    // Function Prototype: Provide comipler w/ info about a function's:
    //                     name, return type, parameters before actual definition
    //                     Enables type checking and allows functions to be used
    //                     before they are defined.

    // BENEFITS: Improves readability organization, prevents errors


    hello("Spongebob", 30);
    if (ageCheck(30)) {
        printf("You are old enough to work at the Krusty Krab!!!\n");
    }
    else {
        printf("You must be 16+ to work at the Krusty Krab!!!");
    }

    return 0;
}

void hello(char name[], int age) {
    printf("Hello %s\n", name);
    printf("You are %d years old\n", age);
}

bool ageCheck(int age){
    return age>=16;
}