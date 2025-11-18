#include <iostream>

int addNumbers(int, int=0, int=0);

int getFactorial(int);
int getFactorial(int&);

int main() {

    std::cout << addNumbers(2) << std::endl;

    std::cout << addNumbers(4, 5) << std::endl;

    std::cout << getFactorial(5) << std::endl;

    return 0;
}

int addNumbers(int a, int b, int c) {
    return a + b + c;
}

int getFactorial(int n) {
    int sum;
    if (n == 1) sum = 1;
    else sum = getFactorial(n - 1) * n;
    return sum;
}