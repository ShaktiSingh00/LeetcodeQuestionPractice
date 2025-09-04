class Solution {
    public int singleNumber(int[] nums) {
        int un = 0;
        for(int num : nums){
            un ^= num;
        }
        return un;
    }
}