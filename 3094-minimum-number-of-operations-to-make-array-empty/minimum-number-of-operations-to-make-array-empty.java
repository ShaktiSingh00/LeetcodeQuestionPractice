class Solution {
    public int minOperations(int[] nums) {
         int ans = 0;
    Map<Integer, Integer> count = new HashMap<>();

    for ( int num : nums)
    {
        count.put(num,count.getOrDefault(num,0)+1);
    }
     

    for (int freq : count.values()) {
     
      if (freq == 1)
        return -1;
      ans += (freq + 2) / 3;
    }

    return ans;
    }
}