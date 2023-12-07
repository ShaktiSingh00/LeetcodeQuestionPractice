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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2 = reverse(l2);
        int carry=0;
        ListNode dum = new ListNode(0);
        ListNode temp=dum;
        while(l1 != null || l2 != null || carry==1){
          int sum=0;
            if(l1 != null){
                sum = sum+l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                sum = sum + l2.val;
                l2=l2.next;
            }

            sum = sum+carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);

            temp.next=node;
            temp=temp.next;
        }

        return reverse(dum.next);
        
    }
    public ListNode reverse(ListNode head){
        ListNode current=head;
                ListNode prev=null;

        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev=current;
            current = next;
        }

        return prev;
    }
}