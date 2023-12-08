/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode *newNode(int val){
    struct ListNode *node = (struct ListNode*) malloc(sizeof(struct ListNode));
    node->val = val;
    node->next = NULL;

    return node;
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
  //Stores head so we can keep track of it
  struct ListNode *head = NULL;
  //Used to add new nodes
  struct ListNode *curr = NULL;

  int carry = 0;
  
  while(l1 || l2){

    int sum = carry;
        
    if(l1){
      sum += l1->val;
    }
        
    if(l2){
      sum += l2->val;
    }

    //If sum is 10 then carry will be 1 otherwise it will be zero because sum is an int so no decimals (ex. 0.9 -> 0)
    carry = sum/10;
    //If number is 10 carry will handle it so we make sum 0;
    sum %= 10;

    //If first iteration through
    if(head == NULL){
      head = newNode(sum);
      curr = head;
    } else {
      curr->next = newNode(sum);
      curr = curr->next;
    }


    if(l1){
      l1 = l1->next;
    }

    if(l2){
      l2 = l2->next;
    }
  }

  //Edge case handling where last two numbers > 10 so there is another carry we have to account for even through 
  //we   have gone through both lists
  if(carry){
    curr->next = newNode(carry);
  }
    
  return head;
}
