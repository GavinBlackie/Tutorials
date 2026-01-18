#include <stdio.h>

int main(){
    // arithmetic operators = + - * / % ++ --
    
    int x = 10;
    int y = 3;
    int z;

    //z = x + y;
    //z = x / y;
    //z = x % y;
    x++;
    y--;

    x += 2;
    x -= 3;
    x *= 2; // x = x * 2
    x /= 4;

    printf("%d\n", x);
    printf("%d\n", y);
    printf("%d\n", z);

    int a = 2;
    int b = 3;
    int c = 4;

    int d = a + b * c; // will produce 14 (+ and - have Right to left Associativity)
    printf("%d\n", d);

    return 0;
}