class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();

        int[] res = new int[n];

        for(int i=0;i<n;i++){
            int num = nums.get(i);

            if(num % 2 != 0){
                int re = (num+1) & -(num+1);

                res[i] = num - (re >> 1);
            }else{
                res[i]=-1;
            }
        }

        return res;
        
    }
}