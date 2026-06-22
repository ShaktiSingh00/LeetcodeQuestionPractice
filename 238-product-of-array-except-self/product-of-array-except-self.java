class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] array = new int[n];
        array[0]=1;

        for(int i=1;i<n;i++){
            array[i] = array[i-1]* nums[i-1];
        }

        int pro =1;

        for(int i=n-1;i>=0;i--){
            array[i]=array[i] * pro;

            pro = pro * nums[i];
        }
        return array;
    }
}