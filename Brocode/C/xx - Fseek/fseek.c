#include <stdio.h> // fseek is in stdio.h file
#include <stdlib.h>
#include <string.h>

int main(void) {

    // fseek = a way to "look back" in files, BUT NOT stdin
    //
    // fseek(FILE*, long offset, int origin);

    FILE* file = fopen("fseek.txt", "r");

    char *str = (char*)calloc(10, sizeof(char));
    printf("WOW here is some output, now give input: ");
    fgets(str, 9, file);

    printf("\nRead in the fisrt string: %s", str);

    fseek(file, 0, SEEK_SET);

    char* str2 = (char*)calloc(10, sizeof(char));
    fgets(str2, 9, file);

    printf("\nRead in the second string: ");
    for (int iChar = 0; iChar < strlen(str2); iChar++) {
        printf("%c", *(str2 + iChar));
    }

    fclose(file);

    return 0;
}