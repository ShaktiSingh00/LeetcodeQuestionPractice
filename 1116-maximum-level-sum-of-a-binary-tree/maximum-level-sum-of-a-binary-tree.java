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
    public int maxLevelSum(TreeNode root) {
        // if(root==null) return 0;

        // Queue<TreeNode> queue = new LinkedList<>();

        // queue.offer(root);

        // int level = 1;
        // int max = Integer.MIN_VALUE;
        // int maxlevel = 1;

        // while(!queue.isEmpty()){

        //     int sum=0;

        //     for(int i=0;i<queue.size();i++){
        //         TreeNode node = queue.poll();

        //         sum += node.val;

        //         if(node.left != null) queue.offer(node.left);
        //         if(node.right != null) queue.offer(node.right);
        //     }
        //     if(sum > max){
        //         max = sum;
        //         maxlevel = level;
        //     }
        //     level++;
        // }

        // return maxlevel;
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 1;
        int maxSum = Integer.MIN_VALUE;
        int answerLevel = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            if (sum > maxSum) {
                maxSum = sum;
                answerLevel = level;
            }

            level++;
        }

        return answerLevel;
    }
}