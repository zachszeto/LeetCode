/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
  if(list1 == NULL && list2 == NULL){
    return NULL;
  }

  if(list1 == NULL && list2 != NULL){
    return list2;
  }

  if(list1 != NULL && list2 == NULL){
    return list1;
  }

  struct ListNode *temp = NULL;

  if(list1->val < list2->val){
    temp = list1;
    list1 = list1->next;
    } 
  
  else {
    temp = list2;
    list2 = list2->next;
  }

  struct ListNode *head = temp;

  while(list1 != NULL || list2 != NULL){
    if( list2 == NULL || (list1 != NULL && list1->val < list2->val)){
      temp->next = list1;
      list1 = list1->next;
    } else {
      temp->next = list2;
      list2 = list2->next;
    }

    temp = temp->next;
  }

  return head;
}
