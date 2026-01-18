#include <stdio.h>
#include <string.h>

int main() {
    // SHOPPING CAR PROGAM
    // printf("Hello, World!"); \n \r \b \t \0

    char item[50] = ""; // a "string"
    float price = 0.0f;
    int quantity = 0;
    char currency = '$';
    float total = 0.0f;

    printf("What item would you like to buy: ");
    // use fgets for input to some variable (useful for primitive collection types)
    fgets(item, sizeof(item), stdin);
    item[strlen(item)] = '\0'; // this line needs the string header
    // \0 is a null terminator character (line above gets rid of the new line in the input)

    printf("What is the price for each?: ");
    scanf("%f", &price);

    printf("How many would you like?: ");
    scanf("%d", &quantity);

    printf("\nYou have bought %d %s\n", quantity, item);

    total = price * quantity;
    printf("Your total is: %c%.2f\n", currency, total);
    
    return 0;
}