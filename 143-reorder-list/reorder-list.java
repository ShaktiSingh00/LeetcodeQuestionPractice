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
    public void reorderList(ListNode head) {
        
        ListNode mid = middleList(head);
        ListNode rev = reverseList(mid.next);
        mid.next = null;
        head = orderList(head,rev);

    }

    public ListNode middleList(ListNode head){
        if(head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head){
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr =next;
        }
        return prev;
    }
    public ListNode orderList(ListNode head1, ListNode head2){
        ListNode org = head1;
        while(head1 != null && head2 != null){
        ListNode temp1 = head1.next;
        ListNode temp2 = head2.next;
        head1.next = head2;
        head2.next = temp1;
        head1 = temp1;
        head2 = temp2;
        }
        return org;
    }
}