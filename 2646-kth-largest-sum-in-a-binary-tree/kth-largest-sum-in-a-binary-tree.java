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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null){
            return 0;
        }        
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            long sum=0;

            for(int i=0;i<size;i++){
                            TreeNode node = queue.poll();

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                sum += (long)node.val;
            }

            list.add(sum);
        }

        long[] res = new long[list.size()];

        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        Arrays.sort(res);

        return k <= res.length ? res[res.length-k] : -1;
    }
}