class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = 0;
        int count = 0;
        long total = 0;
        int max = 0;
        for (int e = 0; e < n; e++) {
            max = Math.max(max, nums[e]);
        }
        while (j < n) {
            if (nums[j] == max) {
                count++;
            }
            while (count >= k) {
                total += n - j;
                if (nums[i] == max) {
                    count--;
                }
                i++;
            }
            j++;
        }
        return total;
    }
}
