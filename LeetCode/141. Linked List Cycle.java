import java.util.HashMap;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        HashSet<ListNode> dict = new HashSet<>();

        while(head != null){
            if(dict.contains(head)){
                return true;
            } else {
                dict.add(head);
                head = head.next;
            }
            
        }
        return false;
    }
}
