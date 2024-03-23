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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null) {
            return null; // If the list is empty, return null
        }
        ListNode mid = middleList(head);
        ListNode prev = null;
        ListNode curr = head;

        // Find the previous node of the middle node
        while (curr != mid) {
            prev = curr;
            curr = curr.next;
        }

        // Delete the middle node by adjusting pointers
        if (prev != null) {
            prev.next = mid.next;
        } else {
            head = mid.next; // If the middle node is the head, update head
        }
        
        return head;

    }
    public ListNode middleList(ListNode head){
        if(head == null){
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
}