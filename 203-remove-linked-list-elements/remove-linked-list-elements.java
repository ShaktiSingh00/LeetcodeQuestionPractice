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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode node = new ListNode();
        node.next=head;
        ListNode newNode = node;
        while(newNode.next != null){
            if(newNode.next.val == val){
                  newNode.next = newNode.next.next;
            }else{
                newNode = newNode.next;
            }
        }
        return node.next;

    }
}