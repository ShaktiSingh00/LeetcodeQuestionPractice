class Solution {
    public int longestPalindromeSubseq(String s) {
        String a = reverseString(s);
        return findLcs(s,a);
    }
    public static int findLcs(String x, String y){
        int n=x.length();
        int m=y.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }

    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder();
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}