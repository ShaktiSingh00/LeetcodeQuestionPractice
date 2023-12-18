class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        // Calculate the maximum product difference
       // int n = nums.length;
        int maxProductDiff = (nums[n - 1] * nums[n - 2]) - (nums[0] * nums[1]);

        return maxProductDiff;
    }
}