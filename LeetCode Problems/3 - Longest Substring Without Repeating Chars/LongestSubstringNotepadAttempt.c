#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct LLNode {
	char data;
	LLNode* next;
} LLNode;

int lengthOfLongestSubstring(char* s) {
	int count = 0; // The substring length counter
	bool duplicateFound = false; // boolean value for if a duplicate is found

	// Case that the string is empty
	if (*s == '\0') return count;

	// Use appropriate data structure to store encountered chars (will use a Linked List)   
	LLNode rootNode = {NULL, NULL};
	LLNode* root = &rootNode;
	LLNode* curr = root;	

	// While we are not at the end of the string (null terminated),
	// AND there are no duplicates found, continue iterating through the string
	while (*s != '\0' && duplicateFound == false) {
		char c = *s;

		// Check for duplicates, start from beginning of list
		curr = root;
		while (curr != NULL) {
			if (c == curr->data) { // Declare a duplicate found, break out of this loop
				duplicateFound = true;
				break;
			}
			curr = curr->next;
		}
		// Add new node to encountered char list
		LLNode* node = (LLNode*)malloc(sizeof(LLNode)); // MUST use malloc here, otherwise it can cause a circular list when using just LLNode
		node->data = c;
		node->next = root;
		root = node; // root = &node // NEVER use single variables when manipulating the root/head
		// Prepare for next iteration
		count ++;
		s += sizeof(char);
	}

	return count;
}

int main() {
	
	char testCases[][10] = { "abcabcbb", "bbbbb", "pwwkew" };
	size_t size = sizeof(testCases) / sizeof(char[10]); // Absolute Size = Bytes Size / Type Size (A = B / T)
	
	for (int iTest = 0; iTest < size; iTest++) {
		printf("%d\n", lengthOfLongestSubstring(testCases[iTest]) );
	}

	return 0;
}