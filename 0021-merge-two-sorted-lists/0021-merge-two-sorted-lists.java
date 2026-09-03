
class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
     ListNode dummy = new ListNode(100);
     ListNode temp = dummy;
     ListNode temp1 = a;
     ListNode temp2 = b;

     while(temp1 !=null && temp2 !=null){
        if(temp1.val <= temp2.val){
            temp.next = temp1;
            temp1=temp1.next ;
        }
        else{
            temp.next = temp2;
            temp2 = temp2.next;
        }
        temp = temp.next;
     }

     if(temp1 == null ) temp.next = temp2;
    else temp.next = temp1;
      
        return dummy.next ;
    }
}