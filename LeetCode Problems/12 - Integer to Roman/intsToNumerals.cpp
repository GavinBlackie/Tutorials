#include <iostream>
using std::string;
using std::cout;
using std::endl;
typedef string String;

String intToRoman(int num) {
    String romanNumeral = "";

    // Range: [1000, inf]
    while (num >= 1000) {
        romanNumeral += "M";
        num -= 1000;
    }

    // Range: [500, 1000]
    while (num >= 500) {
        if (num >= 900) {
            romanNumeral += "CM";
            num -= 900;
        } else {
            romanNumeral += "D";
            num -= 500;
        }
    }

    // Range: [100, 499]
    // While we can still add "Cs", add them
    while (num >= 100) {
        if (num >= 400) {
            romanNumeral += "CD";
            num -= 400;
        } else {
            romanNumeral += "C";
            num -= 100;
        }
    }

    // Range: [50, 99]
    while (num >= 50) {
        if (num >= 90) {
            romanNumeral += "XC";
            num -= 90;
        }
        else {
            romanNumeral += "L";
            num -= 50;
        }
    }

    // Range: [10, 49]
    while (num >= 10) {
        if (num >= 40) {
            romanNumeral += "XL";
            num -= 40;
        }
        else {
            romanNumeral += "X";
            num -= 10;
        }
    }

    // Range: [5, 9]
    // While we can still get "V"s,
    while (num >= 5) {
        if (num >= 9) {
            romanNumeral += "IX";
            num -= 9;
        } else {
            romanNumeral += "V";
            num -= 5;
        }
    }

    // Range: [0, 4]
    // While we can still get "I"s,
    while (num > 0) {
        if (num >= 4) {
            romanNumeral += "IV";
            num -= 4;
        } else {
            romanNumeral += "I";
            num -= 1;
        }
    }

    return romanNumeral;
}

int main() {

    cout << intToRoman(3) << endl;
    cout << intToRoman(4) << endl;
    cout << intToRoman(5) << endl;
    cout << intToRoman(9) << endl;
    cout << intToRoman(30) << endl;
    cout << intToRoman(40) << endl;
    cout << intToRoman(49) << endl;
    cout << intToRoman(50) << endl;
    cout << intToRoman(58) << endl;
    cout << intToRoman(1001) << endl;
    cout << intToRoman(2000) << endl;
    cout << intToRoman(1994) << endl;
    cout << intToRoman(3749) << endl;

    return 0;
}