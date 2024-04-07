class Solution {
    public int[] topKFrequent(int[] nums, int k) {
           Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a min-heap (PriorityQueue) based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            Comparator.comparingInt(Map.Entry::getValue) // Comparator to sort by value (frequency)
        );

        // Step 3: Insert entries into the min-heap
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            // If size of min-heap exceeds k, remove the element with the smallest frequency
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 4: Build the result array from the min-heap
        int[] result = new int[k];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().getKey();
        }

        return result;

    }
}