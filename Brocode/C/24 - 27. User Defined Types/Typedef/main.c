#include <stdio.h>

typedef int Number;
typedef char String[51];
typedef char Initials[3]; // NEED null terminator!! \0

int main() {

    // typedef - reserved keyword that gives an existing datatype a "nickname"
    //          Helps simplify complex types and improves code readability

    //          typedef existing_type new_name;

    int x = 3;
    int y = 4;
    Number z = x + y;

    //char name[] = "Gavin B";
    String name = "Gavin B";

    printf("%d\n", z);
    printf("%s\n", name);

    Initials user1 = "BC";
    Initials user2 = "SS";
    Initials user3 = "PS";
    Initials user4 = "ST";

    printf("%s\n", user1);
    printf("%s\n", user2);
    printf("%s\n", user3);
    printf("%s\n", user4);

    return 0;
}