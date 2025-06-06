class Solution {
    public void nextPermutation(int[] nums) {
int n = nums.length;
        if(nums == null || nums.length <= 1){
            return;
        }
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            int j = n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverseArr(nums,i+1,n-1);
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverseArr(int[] nums, int i, int j){
        while(i<j){
            swap(nums,i++,j--);
            
        }    }
}