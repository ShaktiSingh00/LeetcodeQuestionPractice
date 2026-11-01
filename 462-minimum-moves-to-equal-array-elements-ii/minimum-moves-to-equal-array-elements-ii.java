class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        Arrays.sort(nums);
        int mid = n/2;
        int sum = 0;

        for(int i=0;i<n;i++){
            if(nums[mid] > nums[i]){
                sum += nums[mid]-nums[i];
            }else{
                sum += nums[i]-nums[mid];
            }
        }
        return sum;
    }

}