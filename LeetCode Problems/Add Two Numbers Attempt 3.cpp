#include <iostream>

using std::cout;
using std::endl;

// Given this struct (the constructors are fully defined!!!)
struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    static ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {

        ListNode* answerList = new ListNode(0); // Root to be returned
        ListNode* currAnswer = answerList;
        ListNode* curr1 = l1;
        ListNode* curr2 = l2;

        int carry = 0;
        int sum;
        // Digit-by-digit addition, just like you're taught in school!!
        while ( (curr1 != nullptr || curr2 != nullptr) || carry != 0 ) {
            int x, y;

            if ( curr1 != nullptr && curr2 != nullptr) { // If both numbers exist
                x = curr1->val;
                y = curr2->val;
                sum = x + y + carry;
                // Move node(s)
                curr1 = curr1->next;
                curr2 = curr2->next;

            } else if (curr1 == nullptr && curr2 != nullptr) { // else if only curr2 exists
                y = curr2->val;
                sum = y + carry;
                curr2 = curr2->next; // Move to next node
            } else if (curr1 != nullptr && curr2 == nullptr){ // else only curr1 exists
                x = curr1->val;
                sum = x + carry;
                curr1 = curr1->next; // Move to next node
            } else { // Else neither exist, add the carry and break (theoretically should never run?)
                currAnswer->next = new ListNode(carry);
                carry = 0;
                break;
            }

            if (sum >= 10) { // If we get a >=10 value, place that in the carry slot
                sum -= 10;
                carry = 1;
            } else { // else there is no carry for the next addition
		        carry = 0;	
	        }

            // Move to next answer node, place sum in there
            currAnswer->next = new ListNode(sum);
            // Advance to that node for next iteration
            currAnswer = currAnswer->next;
        }

        currAnswer->val += carry; // ensure any carries are added!

        // Advance the answerList a single time to get rid of the temporary starting 0
        if (answerList->next != nullptr) {
            ListNode* temp = answerList;
            answerList = answerList->next;
            delete temp;
        }

        return answerList;
    }
};

// Simple function for printing entire Linked Lists
void printLinkedList(ListNode* list) {
    ListNode* curr = list;
    while (curr != NULL) {
        cout << " " << curr->val << endl;
        curr = curr->next;
    }
    cout << "\n";
}

int main() {

    // Creating the test cases!:
    // ListNode node3 = {3};
    // ListNode node2 = {4, &node3};
    // ListNode node1 = {2, &node2};
    // ListNode* list1 = &node1;
    // printLinkedList(list1);
    // ListNode node6 = {4};
    // ListNode node5 = {6, &node6};
    // ListNode node4 = {5, &node5};
    // ListNode* list2 = &node4;
    // printLinkedList(list2);

    // ListNode node2 = {2};
    // ListNode node1 = {7, &node2};
    // ListNode* list1 = &node1;
    // printLinkedList(list1);
    // ListNode node4 = {3};
    // ListNode node3 = {1, &node4};
    // ListNode* list2 = &node3;
    // printLinkedList(list2);

    // ListNode node3 = {9};
    // ListNode node2 = {9, &node3};
    // ListNode node1 = {9, &node2};
    // ListNode* list1 = &node1;
    // printLinkedList(list1);
    // ListNode node7 = {9};
    // ListNode node6 = {9, &node7};
    // ListNode node5 = {9, &node6};
    // ListNode node4 = {9, &node5};
    // ListNode* list2 = &node4;
    // printLinkedList(list2);
    ListNode node7 = {9};
    ListNode node6 = {9, &node7};
    ListNode node5 = {9, &node6};
    ListNode node4 = {9, &node5};
    ListNode node3 = {9, &node4};
    ListNode node2 = {9, &node3};
    ListNode node1 = {9, &node2};
    ListNode* list1 = &node1;
    printLinkedList(list1);
    ListNode node11 = {9};
    ListNode node10 = {9, &node11};
    ListNode node9 = {9, &node10};
    ListNode node8 = {9, &node9};
    ListNode* list2 = &node8;
    printLinkedList(list2);

	ListNode* sumList = Solution::addTwoNumbers(list1, list2);
	printLinkedList(sumList);

    return 0;
}


