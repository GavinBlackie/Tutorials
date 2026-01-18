#include <stdio.h>

int main() {
    // break = Break out of a loop (STOP)
    // continue = Skip current cycle (SKIP)

    for (int i = 1; i <= 10; i++){
        
        if (i == 4) {
            continue;
        }

        printf("%d\n", i);
    }
}