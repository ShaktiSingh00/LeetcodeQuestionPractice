class Solution {
    public int minSubarray(int[] nums, int p) {
         int n = nums.length;
        long totalSum = 0;

        // Calculate total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // The remainder we want to remove to make the sum divisible by p
        long remainderToRemove = totalSum % p;

        // If the total sum is already divisible by p, we don't need to remove anything
        if (remainderToRemove == 0) return 0;

        // Use a HashMap to store prefix sums modulo p and their corresponding indices
        HashMap<Long, Integer> prefixModMap = new HashMap<>();
        prefixModMap.put(0L, -1);  // To handle the case where we remove a prefix subarray

        long currentPrefixSum = 0;
        int minLength = n;

        // Traverse through the array and compute prefix sums
        for (int i = 0; i < n; i++) {
            currentPrefixSum = (currentPrefixSum + nums[i]) % p;

            // The target prefix sum we want to find
            long targetPrefixSum = (currentPrefixSum - remainderToRemove + p) % p;

            // If we find such a prefix sum in the map, calculate the length of the subarray
            if (prefixModMap.containsKey(targetPrefixSum)) {
                minLength = Math.min(minLength, i - prefixModMap.get(targetPrefixSum));
            }

            // Update the prefix sum map with the current sum
            prefixModMap.put(currentPrefixSum, i);
        }

        // If we didn't find any valid subarray, return -1
        return minLength == n ? -1 : minLength;
    }
}