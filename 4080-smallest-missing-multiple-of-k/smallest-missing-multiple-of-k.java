class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++){
            hmap.put(nums[i], i);
        }
        int res = k*n;

        for(int i=1;i<=res+1;i++){
            int re = k*i;
            if(!hmap.containsKey(re)){
                return re;
            }
        }
        return 1;
    }
}