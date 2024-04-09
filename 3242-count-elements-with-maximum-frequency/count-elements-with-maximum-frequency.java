class Solution {
    public int maxFrequencyElements(int[] nums) {
       int n = nums.length;
       int sum = 0;
       HashMap<Integer, Integer> hmap = new HashMap<>();
       for(int num : nums){
         hmap.put(num, hmap.getOrDefault(num,0)+1);
       }

       int max = Integer.MIN_VALUE;
       for(int num : hmap.values()){
         max = Math.max(num, max);
         }
       for(int num : hmap.values()){
        if(num == max){
            sum += max;
        }
       }

       return sum;
    }
}