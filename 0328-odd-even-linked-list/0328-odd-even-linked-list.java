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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd= new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode tempA = odd;
        ListNode tempB = even;
        ListNode temp = head;

        while(temp !=null){

                tempA.next = temp ;
                 temp= temp.next;
                tempA = tempA.next;
               
                tempB.next = temp;
                if(temp == null) break;
                 temp= temp.next;
                tempB = tempB.next;
         }
           
        
        tempB.next = null ;
        odd = odd.next;
        even = even.next;
        if(odd==null) return even;
        tempA.next = even;
        return odd;
        
    }
}