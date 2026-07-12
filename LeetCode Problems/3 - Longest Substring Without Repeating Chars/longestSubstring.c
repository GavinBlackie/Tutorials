#include "stdio.h"
#include "stdbool.h"

/* int lengthOfLongestSubstring(char* s) {

    for (int iChar = 0; iChar < 9; iChar++) {
        printf("%c\n", *(s + iChar));
    }

    char* curr = s;
    while (*curr != '\n') {
        printf("%c\n", *curr);
        curr += sizeof(char);
    }
} */

typedef struct StackNode {
    char data;
    StackNode* next;
} StackNode;

int lengthOfLongestSubstring(char* s) {
    printf("\n");
    if (*s == '\0') return 0; // case that its an empty string

    bool duplicateFound = false;
    StackNode firstNode = {*s, NULL};
    StackNode* root = &firstNode;
    StackNode* curr = root;
    while (duplicateFound == false && *s != '\0') {
        printf("%c ", *s);
        // add the current char to the stack
        StackNode node = {*s, NULL};
        printf("%zu", typeof)
        curr->next = &node;
        curr = curr->next;

        // if that char exists in the stack, break (a duplicate exists!)
        // for ___
        //      if ____

        s += sizeof(char); // go to next char
    }

    return 0; // find the LENGTH of the longest substring
}

int main() {
    // int a = 2;
    // int* p = &a;
    // printf( "%zu\n", sizeof(p) );

    // Since this is C, it is assumed the test cases end with
    // a null terminator (as no size parameter is given!)
    char test1[] = "abcabcbb\0"; // avoid compiler warnings, char[] and const char* mix, but not with char* parameters
    lengthOfLongestSubstring(test1);
    char test2[] = "bbbbb\0";
    lengthOfLongestSubstring(test2); // a char[] variable on its own is a char*
    char test3[] = "pwwkew\0";
    lengthOfLongestSubstring(test3);

    return 0;
}