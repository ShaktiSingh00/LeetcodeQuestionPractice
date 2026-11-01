class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int sum=0;

        for(int num : nums){
            sum += num;
            if(num<min){
                min=num;
            }
        }

        return (sum- min*n);
    }
}