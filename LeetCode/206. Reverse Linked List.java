//Thinking
//Create a new ListNode to store the reverse LinkedList then parse through original LinkedList and adding the head of the original to the reverse then moving on to the next value in the original LL.
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
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        while(head != null){
            reverse = new ListNode(head.val, reverse);
            head = head.next;
        }
        return reverse;
    }
}