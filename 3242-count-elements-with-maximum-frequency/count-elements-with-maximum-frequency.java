class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }

        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int freq : hmap.values()){
            max = Math.max(freq, max);
        }

        for(int freq : hmap.values()){
            if(freq == max){
                count += max;
            }
        }

        return count;
    }
}