class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max1=0;
        int count = 0;
        int n = nums.length;
        for(int num : nums){
            max = Math.max(max, num);
        }

        for(int i=0;i<n;i++){
            if(nums[i]==max){
                count++;
            }else{
                count=0;
            }

            max1 = Math.max(count,max1);
        }



        return max1;
    }
}