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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
          int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        ListNode current = head;

        while (top <= bottom && left <= right) {
            // Fill the top row
            for (int j = left; j <= right; j++) {
                if (current != null) {
                    matrix[top][j] = current.val;
                    current = current.next;
                }
            }
            top++;
            
            // Fill the right column
            for (int i = top; i <= bottom; i++) {
                if (current != null) {
                    matrix[i][right] = current.val;
                    current = current.next;
                }
            }
            right--;
            
            // Fill the bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    if (current != null) {
                        matrix[bottom][j] = current.val;
                        current = current.next;
                    }
                }
                bottom--;
            }
            
            // Fill the left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    if (current != null) {
                        matrix[i][left] = current.val;
                        current = current.next;
                    }
                }
                left++;
            }
        }
        
        return matrix;
    }
}