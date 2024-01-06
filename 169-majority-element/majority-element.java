class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }

        for(int num : nums){
            if(hmap.get(num)>nums.length/2){
                return num;
            }
        }

        return -1;
    }
}