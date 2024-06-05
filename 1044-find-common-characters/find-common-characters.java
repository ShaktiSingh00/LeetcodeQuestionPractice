class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26]; // Array to store minimum frequency of each character
        for (int i = 0; i < 26; i++) {
            minFreq[i] = Integer.MAX_VALUE; // Initialize with maximum value
        }

        for (String word : words) {
            int[] charFreq = new int[26]; // Array to store frequency of each character in the current word
            for (char c : word.toCharArray()) {
                charFreq[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charFreq[i]); // Update minimum frequency for each character
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a'))); // Add character to result list
            }
        }

        return result;
    }
}