class Solution {
    public int rob(int[] nums) {
    //     int n=nums.length;
    //     if(n==0){
    //         return nums[0];
    //     }

    //     return Math.max(findMax(nums,0,n-2), findMax(nums,1,n-1));
    // }

    // public static int findMax(int[] nums, int start, int end){
    //     int prev1 = 0;
    //     int prev2 = 0;

    //     int min = 0;
    //     for(int i=start;i<end;i++){
    //         int incl = prev1 + nums[i];
    //         int excl = prev2;
    //         min = Math.max(incl,excl);
    //         prev1=prev2;
    //         prev2 = min;
    //     }
    //     return prev2;
      int n = nums.length;
        if (n == 0) return 0;   // Edge case: No houses
        if (n == 1) return nums[0]; // Edge case: Only one house

        return Math.max(findMax(nums, 0, n - 2), findMax(nums, 1, n - 1));
    }

    private int findMax(int[] nums, int start, int end) {
        if (start > end) return 0;  // Edge case: Empty range

        int prev1 = 0, prev2 = 0; // Start with two zeroes (like Fibonacci approach)
        int maxProfit = 0;

        for (int i = start; i <= end; i++) { // Fix the loop condition
            int incl = prev1 + nums[i];  // Rob this house
            int excl = prev2;  // Skip this house
            maxProfit = Math.max(incl, excl);
            
            prev1 = prev2;  // Move forward
            prev2 = maxProfit;
        }
        return maxProfit;
    }
}