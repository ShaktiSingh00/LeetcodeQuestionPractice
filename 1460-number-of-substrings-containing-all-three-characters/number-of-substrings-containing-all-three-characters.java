class Solution {
    public int numberOfSubstrings(String s) {
         int n = s.length();
        int[] count = new int[3]; // To track occurrences of 'a', 'b', and 'c'
        int left = 0, result = 0;

        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++; // Add current character to window
            
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) { // Valid window found
                result += n - right; // All substrings from [left, right] to [left, n-1] are valid
                count[s.charAt(left) - 'a']--; // Shrink the window from left
                left++;
            }
        }
        
        return result;
    }
}