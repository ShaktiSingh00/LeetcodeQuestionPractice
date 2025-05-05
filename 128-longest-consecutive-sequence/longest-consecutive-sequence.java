class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        int small = Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]-1==small){
                count++;
                small=nums[i];
            }else if(nums[i]!=small){
                count=1;
                small = nums[i];
            }
            max=Math.max(max,count);
        }  

        return max; 
    }
}