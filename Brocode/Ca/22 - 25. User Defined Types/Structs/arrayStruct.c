#include <stdio.h>

typedef struct {
    char model[25];
    short year;
    int kilo;
    double price;
} Car;

void printCar(Car* car);
void printCars(Car* cars, int size);
void printCarsP(Car** cars, int size);

int main() {

    // array of structs = Array where each element contains a struct {}
    //                    Helps organize/group related data together
    //  Remember: stack arrays vs. heap pointer arrays

    Car car1 = {"Ferrari", 2023, 43000, 48000.34};
    Car car2 = {"Camero", 2014, 123000, 6043.99};
    Car car3 = {"Banana Car", 1999, 45000, 1000000.00};

    Car cars[] = {car1, car2, car3};

    Car cars2[] = { {"Ferrari", 2023, 43000, 48000.34},
                    {"Camero", 2014, 123000, 6043.99},
                    {"Banana Car", 1999, 45000, 1000000.00}
    };

    Car* cars3[] = {&car1, &car2, &car3};

    // B / T = A
    int cars2Size = sizeof(cars2) / sizeof(Car);
    int cars3Size = sizeof(cars3) / sizeof(Car*);

    printCars(cars2, cars2Size);
    printCarsP(&cars3, cars3Size);

    printf("-----------------\n");
    printf("A car takes up: %zu bytes\n", sizeof(Car));
    printf("-----------------\n\n");

    printCar(&car1);
    printCar(&car2);
    printCar(&car3);

    return 0;
}

void printCar(Car* car) {
    printf("Model: %4s\n", (*car).model);
    printf("Year: %4hd\n", (*car).year);
    printf("Kilo: %4d\n", (*car).kilo);
    printf("Price: $%4.2lf\n\n", (*car).price);
}

void printCars(Car* cars, int size) {
    for (int i_car=0; i_car < size; i_car++) {
        printCar(&cars[i_car]);
    }
}

void printCarsP(Car** cars, int size) {
    for (int i_car=0; i_car < size; i_car++) {
        printCar( (*cars) + i_car );
    }
}