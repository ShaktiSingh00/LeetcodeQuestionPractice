class Solution {
    public int removeDuplicates(int[] nums) {
         int in=1;
         int count =0;

         for(int i=1 ;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 0;
            }
         

         if(count <=1){
            nums[in++] = nums[i];
         }}

         return in;
    }
}