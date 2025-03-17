class Solution {
    public boolean divideArray(int[] nums) {
         if (nums.length % 2 != 0) return false;

        // HashMap to store frequency of each number
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count occurrences of each number
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Check if every number appears an even number of times
        for (int count : freqMap.values()) {
            if (count % 2 != 0) return false; // If any count is odd, pairing is impossible
        }

        return true;

    }
}