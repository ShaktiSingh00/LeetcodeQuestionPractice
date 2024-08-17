import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // Step 1: Count the frequency of each word
        HashMap<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Step 2: Create buckets to group words by their frequencies
        int maxFreq = Collections.max(freqMap.values());
        List<String>[] buckets = new List[maxFreq + 1]; // Bucket index represents frequency
        for (int i = 0; i <= maxFreq; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 3: Populate the buckets
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            String word = entry.getKey();
            buckets[freq].add(word);
        }

        // Step 4: Sort the words within each bucket lexicographically
        for (int i = 0; i <= maxFreq; i++) {
            Collections.sort(buckets[i]);
        }

        // Step 5: Collect the top k frequent words
        List<String> result = new ArrayList<>();
        for (int i = maxFreq; i >= 0 && result.size() < k; i--) {
            for (String word : buckets[i]) {
                result.add(word);
                if (result.size() == k) {
                    break;
                }
            }
        }

        return result;
    }

}
