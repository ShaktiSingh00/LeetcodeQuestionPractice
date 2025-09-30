class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0, 1); // important: prefix sum divisible by k at index -1

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            int rem = sum % k;
            if (rem < 0) {
                rem += k; // normalize remainder
            }

            if (hmap.containsKey(rem)) {
                count += hmap.get(rem);
            }

            hmap.put(rem, hmap.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}
