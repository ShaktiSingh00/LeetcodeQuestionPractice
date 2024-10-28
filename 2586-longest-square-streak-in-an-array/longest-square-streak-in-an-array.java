class Solution {
    public int longestSquareStreak(int[] nums) {
        // int n = nums.length;
        // HashSet<Integer> hset = new HashSet<>();
        // Arrays.sort(nums);
        // for(int num:nums){
        //     hset.add(num);
        // }

        // int longestStreak = -1;


        // for(int i=0;i<n;i++){
        //     int current = nums[i];
        //     int length=1;
        //     while(hset.contains(current*current)){
        //         current = current*current;
        //         length++;
        //     }
        //     if (length >= 2) {
        //         longestStreak = Math.max(longestStreak, length);
        //     }
        // }

        // return longestStreak;
         Arrays.sort(nums);
        
        // HashMap to store the longest streak ending at each element
        Map<Integer, Integer> dp = new HashMap<>();
        int longestStreak = -1;

        for (int num : nums) {
            // Check if there's a previous number whose square is this number
            int previous = (int) Math.sqrt(num);
            if (previous * previous == num && dp.containsKey(previous)) {
                // If valid, extend the streak from 'previous'
                dp.put(num, dp.get(previous) + 1);
            } else {
                // Otherwise, start a new streak with length 1
                dp.put(num, 1);
            }

            // Only consider streaks of length >= 2
            if (dp.get(num) >= 2) {
                longestStreak = Math.max(longestStreak, dp.get(num));
            }
        }

        return longestStreak;
    }
}