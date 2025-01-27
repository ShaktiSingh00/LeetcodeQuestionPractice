class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] arr = new int[2];
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i=0;i<n;i++){
            if(hmap.containsKey(target-nums[i])){
                arr[0]=hmap.get(target-nums[i]);
                arr[1]=i;
            }
            hmap.put(nums[i],i);
        }
        return arr;
    }
}