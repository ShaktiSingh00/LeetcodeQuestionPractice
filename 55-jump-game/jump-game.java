class Solution {
    public boolean canJump(int[] nums) {
        // int n = nums.length;
        // int lastNum = n-1;

        // for(int i=n-2;i>=0;i--){
        //     if(i+nums[i]>=lastNum){
        //         lastNum=i;
        //     }
        // }

        // return lastNum==0;

        int n=nums.length;
        int max = 0;
 if(n==1)
        {
            return true;
        }
        for(int i=0;i<n & max>=i;i++){
            if(i+nums[i]>max){
                max = i+nums[i];
            }

            if(max>=n-1){
                return true;
            }
        }
        return false;

    }
}