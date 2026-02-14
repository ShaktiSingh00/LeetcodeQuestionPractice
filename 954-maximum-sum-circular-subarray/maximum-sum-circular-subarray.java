class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        int maxSum = nums[0];
        int minSum = nums[0];
        int max1Sum = nums[0];
        int min1Sum = nums[0];
        int totalSum = nums[0];

        for(int i=1;i<n;i++){
            max1Sum = Math.max(max1Sum+nums[i], nums[i]);
            maxSum = Math.max(maxSum, max1Sum);

            min1Sum = Math.min(min1Sum+nums[i], nums[i]);
            minSum = Math.min(minSum, min1Sum);

            totalSum += nums[i];
        }

        int circularSum = totalSum - minSum;

        if(circularSum == 0){
            return maxSum;
        }

        return Math.max(maxSum, circularSum);
    }
}