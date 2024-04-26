class Solution {
    public int singleNumber(int[] nums) {
        // int un=0;
        // for(int i=0;i<nums.length;i++){
        //     un ^=nums[i];
        // }
        // return un;
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }

        for(int num : nums){
            if(hmap.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}