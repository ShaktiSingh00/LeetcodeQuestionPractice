class Solution {
    public long mostPoints(int[][] questions) {
         int n = questions.length;
        long[] dp = new long[n + 1]; // DP array to store maximum points
        
        for (int i = n - 1; i >= 0; i--) {
            int points = questions[i][0];
            int brainpower = questions[i][1];
            
            // Option 1: Solve the question
            int nextIndex = i + brainpower + 1;
            long solve = points + (nextIndex < n ? dp[nextIndex] : 0);
            
            // Option 2: Skip the question
            long skip = dp[i + 1];
            
            // Store the maximum points possible from index i
            dp[i] = Math.max(solve, skip);
        }
        
        return dp[0];
    }
}