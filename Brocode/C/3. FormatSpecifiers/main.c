#include <stdio.h>

int main() {
    // Format specifier = Special tokens that begin with a % symbol,
    //                    followed by a character that specifies the data type
    //                    and optional modifiers (width, precision, flags).
    //                    They control how data is displayed or interpreted.

    int age = 20;
    float gpa = 3.5;
    float price = 25.99;
    double pi = 3.14159265358979;
    char currency = '$';
    char name[] = "Gavin";

    printf("%d\n", age);
    printf("%f\n", price);
    printf("%lf\n", pi);
    printf("%c\n", currency);
    printf("%s\n", name);

    int num1 = 1;
    int num2 = 10;
    int num3 = -100;

    printf("%-4d\n", num1); // Whole numbers adjust alignment
    printf("%+8d\n", num2);
    printf("%+d\n", num3); // And can also create -/+ signs (+ just means include sign)!

    float price1 = 19.99;
    float price2 = 9.99;
    float price3 = -100.00;

    printf("%.2f\n", price1); // Minimum # of characters to display (.#)
    printf("%.2f\n", price2);
    printf("%.10f\n", price3);

}