class Solution {
    public String longestPalindrome(String s) {
         int n = s.length();
        if (n == 0) return "";
        
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLength = 1;

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check for palindromes of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for palindromes of length 3 or more
        for (int len = 3; len <= n; len++) { // Length of substring
            for (int i = 0; i <= n - len; i++) { // Start index
                int j = i + len - 1; // End index

                // Check if the substring s[i..j] is a palindrome
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = len;
                }
            }
        }

        // Return the longest palindrome substring
        return s.substring(start, start + maxLength);

    }
}