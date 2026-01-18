#include <stdio.h>

enum Day {
    SUNDAY=1, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
};

// Can combine with typedef to avoid repeating enum
typedef enum {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
} Month;

void whatSeason(Month);

int main() {

    // enum = A user-defined data type consisting of a set
    //        of named integer constants
    //        Benefit: Replaces numbers with readable names
    //        defaults at first value = 0

    // Declaration and initialization of a "Day" enum type
    enum Day today = SATURDAY;
    printf("The numerical day is: %d\n", today); // Uses the decimal format specifier

    today == SUNDAY || today == SATURDAY ? printf("It's the weekend\n") : printf("It's a weekday\n");

    // Declaration and initialization of a typedef "renamed" enum
    Month month = JUN;
    printf("The numerical month is: %d\n", month);

    

    char a = 'a';
    printf("%hhd\n", a);
    printf("%c\n", a);


    return 0;
}

void whatSeason(Month month) {
    switch (month) {
        case DEC: case JAN: case FEB:
            printf("Its winter!\n");
            break;
        case MAR: case APR: case MAY:
            printf("Its spring!\n");
            break;
        case JUN: case JUL: case AUG:
            printf("Its summer!\n");
            break;
        case SEP:
        case OCT:
        case NOV:
            printf("Its fall!\n");
            break;
        default:
            break;
    }
}