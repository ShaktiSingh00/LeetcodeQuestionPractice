class Solution {
    public int countHillValley(int[] nums) {
        
        // Step 1: Remove consecutive duplicates
        List<Integer> clean = new ArrayList<>();
        clean.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                clean.add(nums[i]);
            }
        }

        // Step 2: Count hills and valleys
        int count = 0;
        for (int i = 1; i < clean.size() - 1; i++) {
            int prev = clean.get(i - 1);
            int curr = clean.get(i);
            int next = clean.get(i + 1);

            if ((curr > prev && curr > next) || (curr < prev && curr < next)) {
                count++;
            }
        }

        return count;
   

    }
}