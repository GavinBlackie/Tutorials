#include <stdio.h>
#include <windows.h>
#include <unistd.h> // Linux/Mac, sleep(# in ms)

int main() {

    // for loop = Repeat some code a limited # of times
    //          for(Initialization; Condition; Iteration or Update)

    for (int i=10; i > 0; i--){
        Sleep(1000);
        printf("%hhd\n", i);
    }
    
    printf("HAPPY NEW YEAR!");


    return 0;
}