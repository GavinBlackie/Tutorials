#include <stdio.h>
#include <math.h>

int main() {

    // COMPOUND INTREST CALCULATOR
    // A = P(1 + i)^nt, i = r/n

    double principal = 0.0;
    double rate = 0.0;
    int years = 0;
    int timesCompounded = 0;
    double total = 0.0;

    printf("\t-----Compound Intrest Calculator-----\n");

    printf("Enter the principal (P): ");
    scanf("%lf", &principal);

    printf("Enter the interest rate %% (r): ");
    scanf("%lf", &rate);
    rate /= 100; // Convert from percentage to floating point form
    floor(rate); // Get rid of floating point errors

    printf("Enter the # of years (t): ");
    scanf("%d", &years);

    printf("Enter # of times compounded per year (n): ");
    scanf("%d", &timesCompounded);

    total = principal * pow(1 + rate / timesCompounded, timesCompounded * years);

    printf("After %d years, the total will be $%.2lf", years, total);

    return 0;
}