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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        // Create a dummy node to handle edge cases (e.g., removing the head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, current = head;

        // Traverse the linked list
        while (current != null) {
            if (numSet.contains(current.val)) {
                // Remove the current node
                prev.next = current.next;
            } else {
                // Move prev forward if the node is not removed
                prev = current;
            }
            current = current.next;
        }

        // Return the modified list, skipping the dummy node
        return dummy.next;
    }
}