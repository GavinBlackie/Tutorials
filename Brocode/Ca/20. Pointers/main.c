#include <stdio.h>

void birthday(int*);

int main() {

    // pointer = A variable that stores memory address of another variable
    //         Benefit/use: Avoid wasting memory by allowing the passing of
    //         larger data structure addresses, avoiding unnecessary copying

    // IRL example: Pizza party, instead of going to each of your friends houses
    //              to hand them pizza, instead invite them to where YOU live to
    //              eat/access the pizza (Tell them your ADDRESS)

    // & - "address of" operator
    // * - "value of" operator
    FILE * banana;
    banana = fopen("banana.txt", "w");
    if (banana == NULL){
        printf("WAAAAH\n");
    }
    fprintf(banana, "BananaBananaApple");
    fclose(banana);


    int age = 20;

    int * pAge;
    pAge = &age;

    printf("The address of age is: %p\n", &age);
    printf("The value of pAge is: %p\n", pAge);
    printf("The value of age is: %d\n", age);
    printf("The value pointed by pAge is: %d\n", *pAge);
    printf("The address of pAge: is: %p\n", &pAge);

    birthday(pAge);
    // birthday(&age);

    printf("The value of age is: %d\n", age);
    printf("The value pointed by pAge is: %d\n", *pAge);

    /*
        "Think of pointers as a key: declare int* ptr has a key,
        and *ptr will unlock it, giving you that value. "
    */

    return 0;
}

// // This will NOT work!!! (local variable)
// // Example of Pass-by-Value
// void birthday(int age){
//     age++;
// }

// parameter int *age is how you "pass-by-reference" in C!
// this is very important for large parameters as they
// avoid entire copies of those values
void birthday(int *age) {
    // MUST use brackets (operator precedence!!! Right-to-Left for *, &)
    (*age)++;
    printf("It is your birthday!\n");
}