class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int in = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[in++]=nums[i];
            }
        }

        for(int j=in;j<n;j++){
            nums[j]=0;
        }
    }
}