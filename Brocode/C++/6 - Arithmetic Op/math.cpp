#include <iostream>

int main() {

    // arithmetic operators = return the result of a specific math
    //                        operation (+ - * /)

    int students = 20;

    //students = students + 1;
    //students += 1;
    students ++;
    students -= 2;

    students *= 2;
    students /= 3;
    
    int remainder = students % 3;

    std::cout << students << std::endl;
    std::cout << remainder << std::endl;

    return 0;
}