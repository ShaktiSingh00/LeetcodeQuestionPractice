class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int count=0,minusCount=0,plusCount=0,max=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                minusCount++;
            }else if(nums[i]==0){
                count++;
            }
            else{
                plusCount++;
            }
            max= Math.max(max,Math.max(minusCount,plusCount));
        }
        return max;
    }
}