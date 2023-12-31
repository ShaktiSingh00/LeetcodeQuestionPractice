class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int n = s.length();
        int max=-1;
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);

            for (int j = n - 1; j > i; j--) {
                if (s.charAt(j) == currentChar) {
                    // Found a matching character
                    int distance = j - i - 1; // Calculate distance between equal characters
                    max = Math.max(max, distance);
                    break; // No need to check further for this character
                }
            }
        }

        return max;
    }
}