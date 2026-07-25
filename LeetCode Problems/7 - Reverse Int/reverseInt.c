#include <stdio.h>
#include <math.h>


int reverse(int x){
    // Keep the sign for later (this problem is mostly the same as a palindrome)
    char sign = (x < 0) ? -1 : 1;
    
    if (x <= -2147483648) { // edge case
        return 0;
    }

    x *= sign; // remove negative sign on x for logic to work

    unsigned int r = 0; // represents the reverse number of x
    
    // While x is still above 0 (it is continually being divided, x will not remain the same afterwards)
    while (x > 0) {

        
        if ( r > (2147483647 / 10) ) {
            return 0;
        }

        // Multiply by 10 to "shift" everything already there to the left,
        // add x mod 10 to get the "rightmost" digit from the returned remainder
        r = (r * 10) + (x % 10);
        x /= 10; // shift to right by one digit
    }

    r *= sign;
    return r;
}

int main() {

    printf("%d\n", reverse(123));
    printf("%d\n", reverse(1534236469));
    printf("%d\n", pow(2, 31));
    printf("%d\n", 214783648);
    printf("%d\n", 1056389759 > pow(2, 31));
    printf("%d\n", 1056389759 > 214783648);

    return 0;
}