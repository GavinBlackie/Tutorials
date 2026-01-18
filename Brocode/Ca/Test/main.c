#include <stdio.h>

int main() {
    long int x=0, y=0;
    printf("Enter the 2 numbers: ");
    scanf("%ld %ld", &x, &y);
    printf("The max is: %ld\n", x > y ? x : y);
}