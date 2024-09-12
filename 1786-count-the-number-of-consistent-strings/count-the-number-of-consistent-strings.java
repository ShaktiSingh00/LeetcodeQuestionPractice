class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
            Set<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int consistentCount = 0;

        // Check each word in the words array
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            // If the word is consistent, increment the count
            if (isConsistent) {
                consistentCount++;
            }
        }

        return consistentCount;
    }
}