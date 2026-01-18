#include <stdio.h>

int main() {
    int x=0;
    printf("Input integer: ");
    scanf("%d", &x);
    x = x > 0 ? ++x: -x;
    return 0;
}