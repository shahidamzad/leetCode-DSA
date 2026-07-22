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
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
      
     ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        // Compare nodes from both lists
        while (a != null && b != null) {

            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        // Attach remaining nodes
        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }
        return dummy.next ;
        
    }
}