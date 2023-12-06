/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode *current = head;
    struct ListNode *next = NULL;
    struct ListNode *prev = NULL;

    while(current){
        //Save current next node
        next = current->next;

        //Set the node to point to the previous node
        current->next = prev;

        //move the two pointers to get ready to do it again
        prev = current;
        current = next;
    }

    return prev;
}
