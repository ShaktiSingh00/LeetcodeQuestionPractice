class Solution {
    public int maxSum(int[] nums) {
        int mx=Integer.MIN_VALUE;
        for(int x : nums){
            mx=Math.max(x,mx);
        }
        if(mx <=0){
            return mx;
        }
      int maxsum=nums[0];
      int currsum=0;
      HashSet<Integer> seen=new HashSet<>();
      for(int num : nums){
        if( num >=0 && !seen.contains(num)){
            currsum =Math.max(num,currsum + num);
            maxsum=Math.max(maxsum,currsum);
            seen.add(num);
        }
      }  
      return maxsum;
    }
}