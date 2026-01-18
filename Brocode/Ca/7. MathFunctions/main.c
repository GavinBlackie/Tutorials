#include <stdio.h>
#include <math.h>

int main() {
    int x = -9;
    float y = 3.99;
    float c = 45;
    // int a = 1, b=0;
    // char d = 127;
    // d = d << 1;
    // a &= b;

    // NOTE: whenever a math function has "f" at the end, it means float
    //       Likewise, "l" at the end means long, and no extra char just
    //       means double by default.

    // NOTE: d32, d64, d128 a the end of a math function represent decimals

    //x = sqrt(x);
    x = pow(x, 3);
    // y = round(y);
    // y = ceil(y);
    // y = floor(y);
    // x = abs(x);
    //c = sin(c);
    c = cos(c);

    // for (unsigned int i=0; i< x; i++){
    //     printf("%u", i);
    // }
    
    printf("%d\n", x);
    printf("%f\n", y);
    printf("%f\n", c);

    return 0;
}