class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;

        int max = 0;

        int evenSetCount = 0;
        int oodCount = 0;

        for(int i=0;i<n;i++){
            Set<Integer> evenSet = new HashSet<>();
            Set<Integer> oddSet = new HashSet<>();

            for(int j=i;j<n;j++){
                if(nums[j]%2 == 0){
                        evenSet.add(nums[j]);
                    
                }else{
                        oddSet.add(nums[j]);
                
                }
                if(evenSet.size() == oddSet.size()){
               
                    max = Math.max(max, j-i+1);
                }
            }
        }
        return max;
        
    }
}