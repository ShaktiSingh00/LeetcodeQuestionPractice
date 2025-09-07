class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        // Count frequencies
        for (int task : tasks) {
            freq.put(task, freq.getOrDefault(task, 0) + 1);
        }
        
        int rounds = 0;
        
        // Calculate rounds for each difficulty
        for (int count : freq.values()) {
            if (count == 1) return -1; // Impossible case
            
            if (count % 3 == 0) {
                rounds += count / 3;
            } else {
                rounds += count / 3 + 1; // handle remainder 1 or 2
            }
        }
        
        return rounds;
    }
}