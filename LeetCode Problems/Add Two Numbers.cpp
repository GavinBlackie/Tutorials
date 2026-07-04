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

        ListNode* answerList = new ListNode(0); // The final LinkedList to be returned

        ListNode* currAnswer = answerList;
        ListNode* curr1 = l1;
        ListNode* curr2 = l2;

        int carry = 0;
        // Digit-by-digit addition, just like you're taught in school!!
        while ( (curr1 != nullptr && curr2 != nullptr) || carry != 0 ) {
            
            // Get the node values
            int val1 = curr1->val;
            int val2 = curr2->val;

            // add the two numbers, accept carry
            int sumVal = val1 + val2 + carry;
            if (sumVal >= 10) { // If we get a >=10 value, place that in the carry slot
                sumVal -= 10;
                carry = 1;
            } else { // else there is no carry for the next addition
		        carry = 0;	
	        }

            // Place the digit we just obtained into the answer list
            currAnswer->val = sumVal;
            
            // Move to next nodes (if possible)
            curr1 = curr1->next;
            curr2 = curr2->next;

            if ( (curr1 != nullptr && curr2 != nullptr) && carry != 0) {
                // Move to next answer node
                currAnswer->next = new ListNode(0);
                currAnswer = currAnswer->next;
            }
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
    // ListNode node3 = {1};
    // ListNode node2 = {2, &node3};
    // ListNode node1 = {7, &node2};
    // ListNode* list1 = &node1;
    // printLinkedList(list1);
    // ListNode node6 = {2};
    // ListNode node5 = {5, &node6};
    // ListNode node4 = {3, &node5};
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

    ListNode node3 = {9};
    ListNode node2 = {9, &node3};
    ListNode node1 = {9, &node2};
    ListNode* list1 = &node1;
    printLinkedList(list1);
    ListNode node6 = {9};
    ListNode node5 = {9, &node6};
    ListNode node4 = {9, &node5};
    ListNode* list2 = &node4;
    printLinkedList(list2);

	ListNode* sumList = Solution::addTwoNumbers(list1, list2);
	printLinkedList(sumList);

    return 0;
}


