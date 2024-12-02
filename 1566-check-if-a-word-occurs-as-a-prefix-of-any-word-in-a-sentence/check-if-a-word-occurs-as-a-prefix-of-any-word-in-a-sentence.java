class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        
        // Loop through each word to check if the searchWord is a prefix
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1; // Return 1-indexed position
            }
        }
        
        // Return -1 if no word has the prefix
        return -1;        
    }
}