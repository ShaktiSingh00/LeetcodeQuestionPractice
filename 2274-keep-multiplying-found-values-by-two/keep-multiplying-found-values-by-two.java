class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n = nums.length;

        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i=0;i<n;i++){
            hmap.put(nums[i],i);
        }

            while(hmap.containsKey(original)){
                original = original*2;
            }
        

        return original;
    }
}