class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return solveFun(cost,n);
    }
    // public static int solveFun(int[] cost, int n){
    //     int[] dp = new int[n+1];
    //     dp[0] = cost[0];
    //     dp[1] = cost[1];

    //     for(int i=2;i<n;i++){
    //         dp[i] = cost[i]+Math.min(dp[i-1],dp[i-2]);
    //     }
    //     return Math.min(dp[n-1],dp[n-2]);
    // }
     public static int solveFun(int[] cost, int n){
          int prev = cost[0];
          int cur = cost[1];
          for(int i=2;i<n;i++){
            int sum = cost[i]+ Math.min(prev,cur);
             prev = cur;
            cur = sum;
          }

          return Math.min(prev, cur);
     }
}