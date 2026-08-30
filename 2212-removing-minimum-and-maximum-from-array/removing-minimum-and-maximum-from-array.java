class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIn = 0;
        int maxIn = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIn]) {
                minIn = i;
            }
            if (nums[i] > nums[maxIn]) {
                maxIn = i;
            }
        }

        int left = Math.min(minIn, maxIn);
        int right = Math.max(minIn, maxIn);

        // 1. Both from left side: right + 1
        // 2. Both from right side: n - left
        // 3. One from left, one from right: (left + 1) + (n - right)
        return Math.min(right + 1, Math.min(n - left, (left + 1) + (n - right)));
    }
}