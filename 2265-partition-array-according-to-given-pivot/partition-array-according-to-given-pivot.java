class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         int n = nums.length;
        int[] res = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                res[count++] = nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                res[count++] = nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                res[count++] = nums[i];
            }
        }
        return res;
    }
}