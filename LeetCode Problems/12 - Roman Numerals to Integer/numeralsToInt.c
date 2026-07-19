#include <stdio.h>

// I got this without any external assistance!! :)) yay
int romanToInt(char* s) {
    int total = 0;

    // "There are six instances where subtraction is used"
    // I before V and X (4 and 9)      -> -= 1
    // X before L and C (40 and 90)    -> -= 10
    // C before D and M (400 and 900)  -> -= 100
    char temp = ' ';
    char* prev = &temp;

    while (*s != NULL) {
        // Adding cases
        switch (*s) {
            case 'I':
                total += 1;
                break;
            case 'V':
                total += 5;
                break;
            case 'X':
                total += 10;
                break;
            case 'L':
                total += 50;
                break;
            case 'C':
                total += 100;
                break;
            case 'D':
                total += 500;
                break;
            case 'M':
                total += 1000;
                break;
        }
        // Subtracting cases
        if ( (*s == 'V' || *s == 'X') && *prev == 'I') {
            total -= 2;
        } else if ( (*s == 'L' || *s == 'C') && *prev == 'X') {
            total -= 20;
        } else if ( (*s == 'D' || *s == 'M') && *prev == 'C') {
            total -= 200;
        }

        // Prepare for next iteration
        *prev = *s;
        s += sizeof(char);
    }

    return total;
}

// simple custom test case function
void testCase(char* test, int correctAnswer) {
    int computedAnswer = romanToInt(test);
    if (computedAnswer == correctAnswer) {
        printf("\"%s\" returned %d which is the same as the correct answer, %d!\n", test, computedAnswer, correctAnswer);
    } else {
         printf("\"%s\" returned %d which is NOT equal to the right answer of %d!\n", test, computedAnswer, correctAnswer);
    }
}

int main() {
    // using the given 3 test cases:
    char test1[] = "III";
    testCase(test1, 3);
    char test2[] = "LVIII";
    testCase(test2, 58);
    char test3[] = "MCMXCIV";
    testCase(test3, 1994);
}