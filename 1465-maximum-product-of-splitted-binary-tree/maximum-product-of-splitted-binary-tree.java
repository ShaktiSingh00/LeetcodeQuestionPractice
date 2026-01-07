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
    long totalSum = 0;
    long maxProduct = 0;
    static final int MOD = 1_000_000_007;
    public int maxProduct(TreeNode root) {
        if(root==null) return 0;

        totalSum = getSumTotal(root);

        maxProductSubTree(root);

        return (int)(maxProduct % MOD);
    }

    public int getSumTotal(TreeNode root){
        if(root == null) return 0;

        return root.val + getSumTotal(root.left) + getSumTotal(root.right);
    }

    public long maxProductSubTree(TreeNode root){
        if(root == null) return 0;

        int sum = root.val;

        long left = maxProductSubTree(root.left);
        long right = maxProductSubTree(root.right);

        long rsum = sum + left + right;

        long res = rsum * (totalSum-rsum);

        maxProduct = Math.max(maxProduct, res);

        return rsum;
    }
}