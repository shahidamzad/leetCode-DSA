
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null ) return head;
        ListNode temp = head.next;
        head.next = head.next.next;
        temp.next = head;
         head.next = swapPairs(head.next);

        return temp;
    }
}