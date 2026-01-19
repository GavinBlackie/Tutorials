#include <stdio.h>

int main() {

    // FILE = a built-in struct in stdio

    // WRITE A FILE
    // fopen returns nullptr or NULL if it fails

    FILE* pFile = fopen("output.txt", "w");

    if (pFile == NULL) {
        printf("Error opening file\n");
        return -1;
    }

    char text[] = "SPONGEBOB DOES THE GRIDDY\nELVES EVERYWHERE";

    // "File formatted print"
    fprintf(pFile, "%s", text);

    printf("File was written successfully\n");

    fclose(pFile); // Always make sure to close files

    return 0;
}