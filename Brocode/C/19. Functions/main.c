#include <stdio.h>
#include <string.h>

// "A function prototype" - but this one is defined where it is declared
void happyBirthday(char birthdayBoi[], int age) {
    printf("Happy birthday to you!\n");
    printf("Happy birthday to you!\n");
    printf("Happy birthday to dear %s!\n", birthdayBoi);
    printf("Happy birthday to you!\n");
    printf("You are %u years old!\n", age);
}

int main() {

    // Functions are resuable sections of code that can be invoked
    // or called based on some arguments (if parameters are specified
    // in the function definition)
    // NOTE: NO FUNCTION OVERLOADING in C!


    // You pass arguments (expressions) to a function, and the 
    // parameters are value identifiers defined inside a function

    char name[50] = "";
    unsigned int age = 0;

    printf("Type your name: ");
    fgets(name, sizeof(name), stdin);
    name[strlen(name) - 1] = '\0';

    printf("Type your age: ");
    scanf("%u", &age);

    happyBirthday(name, age);
    happyBirthday(name, age);
    happyBirthday(name, age);

    return 0;
}

// Underneath main - where you typically define functions