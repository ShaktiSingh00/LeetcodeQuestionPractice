class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int start = 0;
        int end = n-1;
        int count = 0;
        while(start < end){
            if(nums[start]+nums[end] == k){
                count++;
                start++;
                end--;
            }   
            else if(nums[start]+nums[end]<k){
                start++;
            }else{
                end--;
            }
               
        }
        return count;
    }
}