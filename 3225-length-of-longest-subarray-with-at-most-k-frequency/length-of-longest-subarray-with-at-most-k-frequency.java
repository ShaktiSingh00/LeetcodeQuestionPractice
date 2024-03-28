class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int j=0;
        int n = nums.length;
        Map<Integer, Integer> hmap = new HashMap<>();
        int len = 0;
        // while(j<n){
        //     hmap.put(nums[j], hmap.getOrDefault(nums[j],0)+1);
        //     while(i < j && hmap.getOrDefault(nums[j],0) > k) {
        //         hmap.put(nums[i], hmap.get(nums[i])-1);
        //         if(hmap.get(nums[i])==0){
        //             hmap.remove(nums[i]);
        //         }
        //         i++;
        //     }
        //     len = Math.max(len, j-i+1);
        //     j++;
        // }

        // return len;
        for(int i=0;i<n;i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
            while(hmap.get(nums[i])>k){
                hmap.put(nums[j],hmap.get(nums[j])-1);
                j++;
            }
            len = Math.max(len, i-j+1);
        }

        return len;
    }
}