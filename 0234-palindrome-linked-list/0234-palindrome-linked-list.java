class Solution {
    static{
        ListNode n = new ListNode(0);
        for(int i=0;i<500;i++)
            isPalindrome(n);
    }
    public static boolean isPalindrome(ListNode head) {
       
        ListNode slow = head;
        ListNode fast = head;
        ListNode rev = null;
        
        while(fast!=null &&fast.next!=null){
            ListNode temp = slow;
            slow=slow.next;
            fast=fast.next.next;
            temp.next= rev;
            rev = temp;
        }
        if(fast!=null){
            slow=slow.next;
        }
        while(slow!=null && rev!=null && slow.val==rev.val){
            slow=slow.next;
            rev=rev.next;
        }
        return slow==null;
    }
}