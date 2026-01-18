#include <stdio.h>
#include <stdbool.h>
#include <string.h>

struct Student {
    // These are members (or attributes of a struct)
    char name[50];
    int age;
    float gpa;
    bool isFullTime;

};

// Note: typedefs are interpretated by the compiler!!
// whereas #defines are by the preprocessor
// typedefs are for types only, #define can define aliases for values
typedef struct Student Student;

typedef unsigned int uint;
typedef unsigned int uint; // Can do this
//typedef unsigned short uint; // Cannot do this

#define WORD32 unsigned int
#define WORD32 unsigned int
#define WORD32 int // Last define statement overrides

struct Box {
    int height;
    int width;
    int length;
    char colour[50];
};

typedef struct Box Box;

typedef struct {
    char make[50];
    char model[50];
    int year;
    float kilometers;
} Vehicle;

void printStudent(Student* student);

int main() {

    // struct = A custom container that holds multiple pieces
    //          of related information.
    //          Very similar to objects in other languages
    //          Probably does not include grouping operations, however

    struct Student student1 = {"Spongebob", 30, 2.5, true};
    struct Student student2 = {"Patrick", 36, 1.0, false};
    struct Student student3 = {"Squidward", 48, 3.2, false};
    
    Student student4 = {0};

    int err = strncpy_s(student4.name, sizeof(student1.name), "Sandy", 6);
    student4.age = 27;
    student4.gpa = 4.0;
    student4.isFullTime = true;

    printStudent(&student1);
    printStudent(&student2);
    printStudent(&student3);
    printStudent(&student4);

    Box box1 = {10, 20, 40, "Blue"};

    Vehicle vehicle1 = {"Chevy", "Silverado", 2020, 5000};

    return 0;
}

void printStudent(Student* student) {
    printf("Name: \t\t%s\n", (*student).name);
    printf("Age: \t\t%d\n", (*student).age);
    printf("GPA: \t\t%.2f\n", (*student).gpa);
    printf("Full-time: \t%s\n\n", (*student).isFullTime ? "Yes" : "No");
}

