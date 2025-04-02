class Solution {
    public long maximumTripletValue(int[] nums) {
       int n = nums.length;
        long maxValue = 0;
        
        long maxLeft = nums[0]; // Maximum nums[i] encountered so far
        long[] maxRight = new long[n]; // maxRight[k] stores max nums[k] for k >= j+1
        
        maxRight[n - 1] = nums[n - 1];
        for (int k = n - 2; k >= 0; k--) {
            maxRight[k] = Math.max(maxRight[k + 1], nums[k]);
        }
        
        for (int j = 1; j < n - 1; j++) {
            long currentValue = (maxLeft - nums[j]) * maxRight[j + 1];
            maxValue = Math.max(maxValue, currentValue);
            maxLeft = Math.max(maxLeft, nums[j]); // Update maxLeft for the next iteration
        }
        
        return maxValue;
    }
}