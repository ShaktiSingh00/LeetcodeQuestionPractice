class Solution {
    public boolean closeStrings(String word1, String word2) {
        //   if (word1.length() != word2.length()) {
        //     return false;
        // }

        // int[] w1 = new int[26];
        // int[] w2 = new int[26];

        // for (char c : word1.toCharArray()) {
        //     w1[c - 'a']++;
        // }

        // for (char c : word2.toCharArray()) {
        //     w2[c - 'a']++;
        // }

        // for (int i = 0; i < 26; i++) {
        //     if ((w1[i] == 0 && w2[i] != 0) || (w1[i] != 0 && w2[i] == 0)) {
        //         return false;
        //     }
        // }

        // // Frequency maps for each character in word1 and word2
        // Map<Integer, Integer> hmap = new HashMap<>();

        // // Populate frequency maps for word1
        // for (int i : w1) {
        //     if(i>0){
        //     hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        // }
        // }
        // for (int i : w2) {
        //     if (i > 0) {
        //         if (!hmap.containsKey(i)) {
        //             return false;
        //         }
        //         hmap.put(i, hmap.get(i) - 1);
        //         if (hmap.get(i) == 0) {
        //             hmap.remove(i);
        //         }
        //     }
        // }

        // return hmap.isEmpty();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < word1.length(); ++i) {
            freq1[word1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word2.length(); ++i) {
            freq2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; ++i) {
            if ((freq1[i] > 0 && freq2[i] == 0) || (freq2[i] > 0 && freq1[i] == 0)) {
                return false; 
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for (int i = 0; i < 26; ++i) {
            if (freq1[i] != freq2[i]) {
                return false; 
            }
        }
        return true;
    }
}