class Solution {
    public int findMaxLength(int[] nums) {
        // int max = 0;
        // for(int i=0;i<nums.length;i++){
        //     int count =0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==0){
        //             count++;
        //         }else {
        //             count--;
        //         }
        //         if(count == 0) {
        //             max = Math.max(max, j-i+1);
        //         }
        //     }
        // }
        //     return max;
        Map<Integer, Integer> hmap = new HashMap<>();
        int max = 0, sum =0;
        hmap.put(0, -1);
        for(int i=0 ;i< nums.length; i++){
            sum += (nums[i] == 0) ? -1 : 1;
            if(hmap.containsKey(sum)){
                max = Math.max(max, i-hmap.get(sum));
            }else {
                hmap.put(sum, i);
            }
        }
        return max;
}   
}