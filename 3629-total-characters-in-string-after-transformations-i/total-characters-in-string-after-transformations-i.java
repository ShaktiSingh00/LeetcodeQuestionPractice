class Solution {
    public int lengthAfterTransformations(String s, int t) {
        //  int MOD = 1_000_000_007;

        // // Initialize frequency map
        // Map<Character, Long> freqMap = new HashMap<>();
        // for (char c : s.toCharArray()) {
        //     freqMap.put(c, freqMap.getOrDefault(c, 0L) + 1);
        // }

        // // Only characters 'a' to 'z' can appear
        // for (int i = 0; i < t; i++) {
        //     Map<Character, Long> nextMap = new HashMap<>();

        //     for (char c = 'a'; c <= 'z'; c++) {
        //         long count = freqMap.getOrDefault(c, 0L);
        //         if (count == 0) continue;

        //         if (c == 'z') {
        //             // z -> ab
        //             nextMap.put('a', (nextMap.getOrDefault('a', 0L) + count) % MOD);
        //             nextMap.put('b', (nextMap.getOrDefault('b', 0L) + count) % MOD);
        //         } else {
        //             char nextChar = (char)(c + 1);
        //             nextMap.put(nextChar, (nextMap.getOrDefault(nextChar, 0L) + count) % MOD);
        //         }
        //     }

        //     freqMap = nextMap; // Use new frequencies for next round
        // }

        // // Compute total length after t transformations
        // long result = 0;
        // for (long val : freqMap.values()) {
        //     result = (result + val) % MOD;
        // }

        // return (int) result;

         int MOD = 1000000007;
        // freq[i] means how many times character (char)(i + 'a') appears
        long[] freq = new long[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Perform t transformations
        for (int i = 0; i < t; i++) {
            long[] nextFreq = new long[26];
            for (int j = 0; j < 26; j++) {
                if (j == 25) { // 'z'
                    nextFreq[0] = (nextFreq[0] + freq[25]) % MOD; // 'a'
                    nextFreq[1] = (nextFreq[1] + freq[25]) % MOD; // 'b'
                } else {
                    nextFreq[j + 1] = (nextFreq[j + 1] + freq[j]) % MOD;
                }
            }
            freq = nextFreq;
        }

        // Sum all frequencies to get final length
        long result = 0;
        for (long count : freq) {
            result = (result + count) % MOD;
        }

        return (int) result;
    }
}