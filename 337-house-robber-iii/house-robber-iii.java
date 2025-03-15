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
    public int rob(TreeNode root) {
          Map<TreeNode, Integer> memo = new HashMap<>();
        return dfs(root, memo);
    }

    private int dfs(TreeNode node, Map<TreeNode, Integer> memo) {
        if (node == null) return 0;
        if (memo.containsKey(node)) return memo.get(node);

        // Rob current node (skip its children, include grandchildren)
        int robCurrent = node.val;
        if (node.left != null) {
            robCurrent += dfs(node.left.left, memo) + dfs(node.left.right, memo);
        }
        if (node.right != null) {
            robCurrent += dfs(node.right.left, memo) + dfs(node.right.right, memo);
        }

        // Skip current node (rob its children)
        int skipCurrent = dfs(node.left, memo) + dfs(node.right, memo);

        // Store result in memo and return the max value
        int result = Math.max(robCurrent, skipCurrent);
        memo.put(node, result);
        return result;
    }
}