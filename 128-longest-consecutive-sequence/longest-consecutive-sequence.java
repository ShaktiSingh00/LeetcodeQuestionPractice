class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n==0){
            return 0;
        }

        HashSet<Integer> hset = new HashSet<>();
        for(int i=0;i<n;i++){
            hset.add(nums[i]);
        }
        int maxA=1;

        for(int num : hset){
            if(hset.contains(num-1)){
                continue;
            }else {
                int longs=1;
                int cur = num;
                while(hset.contains(cur+1)){
                    longs++;
                    cur++;
                }
                maxA = Math.max(longs,maxA);
            }
        }
        return maxA;
    }
}