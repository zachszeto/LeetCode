/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    bool traverse(struct ListNode *fast, struct ListNode *slow){
        if(fast == NULL || fast->next == NULL){
            return false;
        }

        if(slow == NULL || slow->next == NULL){
            return false;
        }

        if(slow == fast){
            return true;
        }

        return traverse(fast->next->next, slow->next);
    }
    

    if(head == NULL){
        return false;
    }

    return traverse(head->next, head);
}