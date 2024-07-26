class Solution {
    public int rob(int[] nums) {
        // int n = nums.length;
        // if (n == 0) {
        //     return 0;
        // }
        // if (n == 1) {
        //     return nums[0];
        // }
        
        // int[] dp = new int[n];
        // dp[0] = nums[0];
        // dp[1] = Math.max(nums[0], nums[1]);
        
        // for(int i = 2; i < n; i++){
        //     int incl = dp[i-2] + nums[i];
        //     int excl = dp[i-1];
            
        //     dp[i] = Math.max(incl, excl);
        // }
        // return dp[n-1];  int n = nums.length;
        int prev1 = 0;
        int prev2 = nums[0];
        int n = nums.length;
       // dp[1] = Math.max(nums[0], nums[1]);
        
        for(int i = 1; i < n; i++){
            int incl = prev1 + nums[i];
            int excl =  prev2 + 0;
            
            int ans = Math.max(incl, excl);
            prev1= prev2;
            prev2 = ans;
        }
        return prev2;
    }
}