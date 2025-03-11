class Solution {
    public long countVowels(String word) {
         long totalVowelCount = 0;
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                totalVowelCount += (long) (i + 1) * (n - i); // Compute contribution
            }
        }
        
        return totalVowelCount;
    }
    
    private boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1; // Check if it's a vowel
    }
    
}