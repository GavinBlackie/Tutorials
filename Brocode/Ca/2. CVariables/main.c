#include <stdio.h>
#include <stdbool.h> // Include standard boolean header preprocessing directive

int main(){
    // variable = A resuable container for a value
    //            Behaves as if it were the value it contains

    // int = whole numbers (4 bytes in modern systems)
    // float = single-precision decimal number (4 bytes)
    // double = double-precision decimal number (8 bytes)
    // char = single character (1 byte)
    // char[] = array of characters (size varies)
    // bool = true or false (1 byte, requires <stdbool.h>)

    int age = 20;
    int year = 2025;
    int quantity = 1;
    float gpa = 2.5;
    float price = 28.99;
    float length = 0.8764;
    double pi = 3.14159265358979;
    double e = 2.718281828459045235360287471352;
    char grade = 'A';
    char symbol = '*';
    char name[] = "Gavin"; // Array of characters for strings
    char food[] = "Steak";
    char canadaCapital[] = "Ottawa";
    bool isOnline = true; // can also use 1 or 0
    bool isStudent = true;

    // % is format specifier (d for decimal)
    printf("You are %d years old.\n", age);
    printf("The year is %d.\n", year);
    printf("You have ordered %d x items\n", quantity);
    printf("Your gpa is %f\n", gpa);
    printf("The price is: $%f", price);
    printf("The length of the line is %f\n", length);
    printf("Pi is: %lf\n", pi); // lf means "long float"
    printf("e is: %lf\n", e);
    printf("Your grade is %c\n", grade);
    printf("Your favourite symbol is %c\n", symbol);
    printf("Hello, %s\n", name);
    printf("Your favourite food is %s\n", food);
    printf("The capital of Canada is %s\n", canadaCapital);
    printf("%d\n", isOnline);
    
    if (isOnline) {
        printf("You are online");
    }
    else {
        printf("You are offline");
    }

    return 0;
}