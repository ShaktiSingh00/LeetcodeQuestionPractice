class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
        HashSet<Integer> hset = new HashSet<>();
        for(int num : nums){
            if(!hset.contains(num)){
       
            hset.add(num);

            if(num>max){
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            }else if(num>secondMax){
                thirdMax = secondMax;
                secondMax = num;
            }else if(num>thirdMax){
                thirdMax = num;
            }
        }
                 
            }

        return hset.size()>=3 ? thirdMax : max;
    }
}
         