class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int first=0;
        int last = n-1;
        while(first<=last){
            int mid = first + (last-first)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return -1;
    }
}