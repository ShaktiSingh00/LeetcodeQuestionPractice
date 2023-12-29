class Solution {
    public int singleNumber(int[] nums) {
        int un=0;
        for(int i=0;i<nums.length;i++){
            un ^=nums[i];
        }
        return un;
    }
}