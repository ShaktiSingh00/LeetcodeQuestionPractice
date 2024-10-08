/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     private int count = 0;  // To count visited nodes
    private int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        inOrderTraversal(root, k);
        return result;
    }

    private void inOrderTraversal(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        // Traverse the left subtree
        inOrderTraversal(node.left, k);
        
        // Visit the node
        count++;
        if (count == k) {
            result = node.val;  // Store the k-th smallest value
            return;  // Exit as we found the k-th smallest
        }

        // Traverse the right subtree
        inOrderTraversal(node.right, k);
    
    }
}