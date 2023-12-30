class Solution {
    public int longestOnes(int[] nums, int k) {
       int i=0;
       int j=0;
       int count1=0;
       int count0=0;
       int n=nums.length;
       int max=Integer.MIN_VALUE;
       while(j<n){
           if(nums[j]==0){
               count0++;
           }
           if(count0 > k){
               if(nums[i]==0){
               count0--;
           }
           i++;

           }
           max =Math.max(max,j-i+1);
                      j++;


       }
       return max;
        
    }
}