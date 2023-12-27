class Solution {
    public int minCost(String colors, int[] neededTime) {
          int i = 1, j = 0;
        int currentSum = neededTime[0];
        int max = neededTime[0];
        
        for (i = 1; i < neededTime.length; i++) {
            
            if (colors.charAt(i) == colors.charAt(j)) {
                max = Math.max(max, neededTime[i]);
                currentSum += neededTime[i];
            }
            
            else {
                currentSum -= max;
                max = neededTime[i];
                currentSum += max;
                j = i;
            }
                
                
        }
        
        currentSum -= max;
        
        return currentSum;
    }
}