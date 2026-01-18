#include <stdio.h>
#include <string.h>

int main(){
    // Consider adding default values immediately to avoid undef behavior
    int age = 0;
    float gpa = 0.0f; // "f" isn't needed for a double
    char grade = '\0'; // \0 is the null terminator character
    char name[30] = ""; // make it an empty string, but still takes up 30 chars

    printf("Enter your age: ");
    scanf("%d", &age);

    printf("Enter your gpa: ");
    scanf("%f", &gpa);

    // Newline character, \n, is still in input buffer (floats are alphanumeric)
    // by adding an extra space in the next scan, the input buffer is cleared
    
    printf("Enter your grade: ");
    scanf(" %c", &grade);

    getchar(); // empties the input buffer
    printf("Enter your full name: ");
    fgets(name, sizeof(name), stdin); // fgets (file get string), stdin = standard input
    name[strlen(name) - 1] = '\0'; // Get rid of the \n part of the input

    printf("%d\n", age);
    printf("%.2f\n", gpa);
    printf("%c\n", grade);
    printf("%s\n", name);

    // x = !x
    // x < 2 ? x++ : x--


    return 0;
}