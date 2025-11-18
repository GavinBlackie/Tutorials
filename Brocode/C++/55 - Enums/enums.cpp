#include <iostream>

enum Day {
    SUNDAY=1, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
};

enum Flavour {
    VANILLA, CHOCOLATE, STRAWBERRY, MINT
};

enum Colour {
    RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE
};

int main() {

    // enums = a user-defined data type consiting of paired
    //         named-integer constants (default starts @ 0).
    //         GREAT for sets of potential options.

    //std::string today = "Sunday";
    Day today = SUNDAY;

    // can use .size() or .length()
    // for (int i = 0; i < today.size() ; i++) {
    //     today[i] = std::tolower(today[i]);
    // }
    //std::cout << today << std::endl;

    // Note: Cannot switch on a string!
    switch (today) {
        case SUNDAY :       std::cout << "It is Sunday!\n";
                            break;
        case MONDAY :       std::cout << "It is Monday!\n";
                            break;
        case TUESDAY :      std::cout << "It is Tuesday!\n";
                            break;
        case WEDNESDAY :    std::cout << "It is Wednesday!\n";
                            break;
        case THURSDAY :     std::cout << "It is Thursday!\n";
                            break;
        case FRIDAY :       std::cout << "It is Friday!\n";
                            break;
        case SATURDAY :     std::cout << "It is Saturday!\n";
                            break;
        default :           std::cout << "It is no day!\n";
                            break;
    }

    return 0;
}