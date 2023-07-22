//Thinking
//Implement a merge sort algorithm. If L1 is less than L2 add L1 to the new ListNode otherwise add L2. If one of the lists is empty then just keep adding the other ListNode to the new ListNode until both ListNodes are empty.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode(0);
        ListNode tail = merge;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        while(list1 == null && list2 != null){
            tail.next = list2;
            list2 = list2.next;
            tail = tail.next;
        }

        while(list1 != null && list2 == null){
            tail.next = list1;
            list1 = list1.next;
            tail = tail.next;
        }
        return merge.next;
    }
}