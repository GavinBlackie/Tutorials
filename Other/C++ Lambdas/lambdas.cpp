#include <iostream> // std:: cout, cin, cerr, clog

int main() {

    // Lambda Function = a way to create a function without physically
    //                   creating a function
    //
    //                   Behaves more like an individual variable

    // whenever there is a function ptr, you can use a lambda

    // Syntax:
    // modifier name = [scope-capture] (parameters) -> return-type {};

    // Capture clauses: & (all external by-reference), 
    //                  = (all external variables by-value (copies)),
    //                  a, &b (a by-value, b by-reference) 

    // use mutable at return-type to specify not const scope vars
    
    // auto -> automatically find out what type this func returns

    auto two = [](int x) -> int {
        return x + x;
    };

    std::cout << two(5) << std::endl;

    int a=0;
    int b = 6;

    auto banana = [&]() -> int{
        std::cout << ++a << " " << b++ << std::endl;
    };

    int c = banana();

    int arr[5] = {4, 5, 2, 3, 4};

    auto apple = [&](){
        (*arr)++; // Does not increment that value (arr is a reference)
    };

    (*arr)--; // Does increment that value (arr is just a value)
    for (int i = 0; i < 5; i++){
        std::cout << arr[i] << std::endl;
    }

    // By value only modifies the copies
    // mutable makes "a" not a const readonly value
    auto byVal = [=]() mutable{
        a += 110;
        std::cout << a+10 << std::endl;
    };
    byVal();

    std::cout << a << " " << b++ << std::endl;

    return 0;
}