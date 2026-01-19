#include <stdio.h>

int main() {

    // READ A FILE

    FILE* pFile = fopen("elves.txt", "r");

    if (pFile == NULL) {
        printf("Could not open file!\n");
        return 1;
    }

    char buffer[1024] = {0}; // 1KB buffer

    while (fgets(buffer, sizeof(buffer), pFile) != NULL) {
        printf("%s", buffer);
    }

    // fscanf(pFile, "%s", buffer);
    // printf("%s\n", buffer);

    fclose(pFile); // Always close the file

    return 0;
}