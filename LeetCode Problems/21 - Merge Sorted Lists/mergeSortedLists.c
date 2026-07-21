#include <stdio.h>

struct ListNode {
    int val;
    struct ListNode *next;
};

struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode* head = NULL;

    // "Base case"
    if (list1 == NULL && list2 == NULL) {
        return head;
    }

    struct ListNode temp = {0, NULL};
    head = &temp;
    struct ListNode* curr = head;

    while (list1 != NULL && list2 != NULL) {
        if (list2 == NULL) { // Only list1 has a value
            curr->next = list2;
            list1 = list1->next; // *(list1).next
        }
        else if (list1 == NULL) { // Only list2 has a value
            curr->next = list1;
            list2 = list2->next;
        }
        else { // BOTH have values (compare)

            if (list1->val <= list2->val) { // Add the first node in the "equal case"
                // Add 1 first, 2 second
                curr->next = list1;
                curr = curr->next;
                curr->next = list2;
            }
            else if (list2->val < list1->val) {
                // Add 2 first, 1 second
                curr->next = list2;
                curr = curr->next;
                curr->next = list1;
            }

            list1 = list1->next;
            list2 = list2->next;
        }
        // Current value advances at least once no matter what
        curr = curr->next;
    }

    return head;
}

int main() {
    struct ListNode* 

    mergeTwoLists();
}