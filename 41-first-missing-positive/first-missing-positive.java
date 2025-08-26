class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums); // Step 1: sort the array
        
        int missing = 1;
        for (int num : nums) {
            if (num == missing) {
                missing++; // found current missing, so move to next
            }
        }
        return missing;
        
    }
}