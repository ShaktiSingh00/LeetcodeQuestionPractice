class Solution {
    public long maxKelements(int[] nums, int k) {
  PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements of the array to the max heap (convert to long to avoid overflow)
        for (int num : nums) {
            maxHeap.offer((long) num);
        }

        long score = 0;

        // Perform k operations
        for (int operation = 0; operation < k; operation++) {
            // Extract the maximum element
            long maxElement = maxHeap.poll();
            
            // Increase the score by the maximum element
            score += maxElement;
            
            // Replace the selected element with ceil(maxElement / 3)
            maxHeap.offer(divideByThree(maxElement));
        }

        return score;
    }

    public static long divideByThree(long num){
        return (long)Math.ceil(num/3.0);
    }
}