class Solution {
    public int maxFreqSum(String s) {
         HashMap<Character, Integer> freqMap = new HashMap<>();

        // count frequencies
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        String vowels = "aeiou";
        int maxVowel = 0;
        int maxConsonant = 0;

        for (char ch : freqMap.keySet()) {
            int count = freqMap.get(ch);
            if (vowels.indexOf(ch) != -1) {
                // it's a vowel
                if (count > maxVowel) {
                    maxVowel = count;
                }
            } else {
                // consonant
                if (count > maxConsonant) {
                    maxConsonant = count;
                }
            }
        }

        return maxVowel + maxConsonant;
    }
}