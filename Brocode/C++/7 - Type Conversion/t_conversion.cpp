#include<iostream>

int main() {

    // type conversion = conversion of a value of one data type to another
    //                   Implicit = automatic
    //                   Explicit = Precede value with new type, accept
    //                              that errors can happen

    char x = 100;
    std::cout << x << std::endl;
    std::cout << 100 << std::endl;
    std::cout << (char)100 << std::endl;

    // Important : casting in integer division scenario
    int correct = 8;
    int questions = 10;
    double score = correct / (double)questions * 100;

    std::cout << score << "%";

    return 0;
}