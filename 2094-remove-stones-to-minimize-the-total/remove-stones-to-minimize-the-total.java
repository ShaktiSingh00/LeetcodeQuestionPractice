class Solution {
    public int minStoneSum(int[] piles, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all piles to the max-heap
        for (int num : piles) {
            pq.offer(num);
        }

        // Perform k operations
        for (int j = 0; j < k; j++) {
            int maxPile = pq.poll(); // Get the largest pile
            int reducedPile = maxPile - maxPile / 2; // Remove floor(pile / 2) stones
            pq.offer(reducedPile); // Put the updated pile back into the heap
        }

        // Sum up all the remaining stones
        int totalStones = 0;
        while (!pq.isEmpty()) {
            totalStones += pq.poll();
        }

        return totalStones;
    }
}