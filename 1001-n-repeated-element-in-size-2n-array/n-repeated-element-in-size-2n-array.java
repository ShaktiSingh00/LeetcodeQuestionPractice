class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;

        int uniq = n/2;

        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i=0;i<n;i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> hm : hmap.entrySet()){
            if(hm.getValue() == uniq){
                return hm.getKey();
            }
        }

        return 0;
    }
}