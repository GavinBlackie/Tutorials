#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define TIRES 4

typedef struct {
    int vin;
    char make[50];
    char model[50];
    short year;
    int* tireDmg;
} car_t;

int main() {

    printf("%zu\n", sizeof(car_t));

    // Examples of memory on the STACK:
    int x;
    int y[15]; // Regular array
    car_t car; // Basic struct instance

    car.vin = 123456;
    strcpy(car.make, "Ford"); // Setting a char array value
    strcpy(car.model, "F150");
    car.year = 2014;

    // ptr tiredmg on stack, contents will be on the heap
    car.tireDmg = (int*) malloc(TIRES * sizeof(int));

    // Car array (stack)
    car_t cars[5];

    // Examples of memory on the HEAP:

    // Dynamic array of shorts (ptr on stack, shorts on heap)
    short* z = (short*) calloc(10, sizeof(short));
    for (int i_z=0; i_z < 10; i_z++) { // Setting some heap values
        *(z + i_z) = i_z * i_z;
    }

    // Dynamic array of car_t
    car_t* heapCars = (car_t*) malloc(10 * sizeof(car_t));


    return 0;
}