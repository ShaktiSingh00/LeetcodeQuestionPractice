class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        // Arrays.sort(nums);
        // int longest = 0;
        // int count = 0;
        // int lastSmall = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     if(nums[i]-1 == lastSmall){
        //         count++;
        //         lastSmall = nums[i];
        //     }else if(nums[i] != lastSmall){
        //         count=1;
        //         lastSmall = nums[i];
        //     }

        //     longest = Math.max(longest, count);
        // }
        // return longest;
        Set<Integer> hset = new HashSet<>();
        int longest=0;
        for(int i=0;i<n;i++){
            hset.add(nums[i]);
        }
        for(int res : hset){
            if(!hset.contains(res-1)){
                int count =1;
                int x = res;
                while(hset.contains(x+1)){
                    count++;
                    x = x+1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}