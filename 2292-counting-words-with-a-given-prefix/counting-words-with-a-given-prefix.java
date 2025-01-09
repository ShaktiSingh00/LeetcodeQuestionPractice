class Solution {
    public int prefixCount(String[] words, String pref) {
       int count = 0;
        int prefLength = pref.length();

        for (String word : words) {
            // Check if the word starts with the prefix
            if (word.length() >= prefLength && word.substring(0, prefLength).equals(pref)) {
                count++;
            }
        }

        return count;
        }
}