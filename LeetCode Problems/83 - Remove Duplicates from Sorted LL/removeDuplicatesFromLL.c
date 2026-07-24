#include <stdio.h>

// Given definition of a LL node
struct ListNode {
    int val;
    struct ListNode *next;
};

struct ListNode* deleteDuplicates(struct ListNode* head) {
    if (head == NULL) {
        return head;
    }
    struct ListNode* curr = head;
    struct ListNode* headAns = head;
    struct ListNode* currAns = headAns;

    while (curr != NULL) {
        curr = curr->next; // move forward in advance
        if (curr == NULL) { // Break out to avoid null pointer errors when accessing ->val field
            break;
        }

        // If the val at curr is DOES NOT equal to the value at currAns, add that value to the list
        if (curr->val != currAns->val) {
            currAns->next = curr;
            currAns = currAns->next; // move the "answer" LinkedList forward
        }
    }
    currAns->next = NULL;

    return headAns;
}

typedef ListNode ListNode;

void printLinkedList(ListNode* curr) {
    printf("[");
    while (curr != NULL) {
        printf("%d, ", curr->val);
        curr = curr->next;
    }
    printf("\b\b]\n");
}

int main() {
    // The first, "a", given test case:
    ListNode node3a = {2, NULL};
    ListNode node2a = {1, &node3a};
    ListNode node1a = {1, &node2a};

    // The second, "b", given test case:
    ListNode node5b = {3, NULL};
    ListNode node4b = {3, &node5b};
    ListNode node3b = {2, &node4b};
    ListNode node2b = {1, &node3b};
    ListNode node1b = {1, &node2b};

    // Should be [1, 2]
    ListNode* test1 = deleteDuplicates(&node1a);
    // Should be [1, 2, 3]
    ListNode* test2 = deleteDuplicates(&node2b);

    printLinkedList(test1);
    printLinkedList(test2);
}