class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map<Integer, Integer> frequencyMap = new HashMap<>();
        // for (int num : nums) {
        //     frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        // }

        // // Step 2: Create a min-heap (PriorityQueue) based on frequency
        // PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
        //     Comparator.comparingInt(Map.Entry::getValue) // Comparator to sort by value (frequency)
        // );

        // // Step 3: Insert entries into the min-heap
        // for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        //     minHeap.offer(entry);
        //     // If size of min-heap exceeds k, remove the element with the smallest frequency
        //     if (minHeap.size() > k) {
        //         minHeap.poll();
        //     }
        // }

        // // Step 4: Build the result array from the min-heap
        // int[] result = new int[k];
        // int index = 0;
        // while (!minHeap.isEmpty()) {
        //     result[index++] = minHeap.poll().getKey();
        // }

        // return result;
         List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num,0) + 1);
        }
        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] ans = new int[k];
        int pos = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size() && pos < k; j++) {
                    ans[pos] = bucket[i].get(j);
                    pos++;
                }
            }
        }
        return ans;

    }
}