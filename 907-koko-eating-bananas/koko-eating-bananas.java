class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max, piles[i]);
        }
        int start =1, end = max;
        int ans = max;

        while(start<=end){
            int mid = start + (end-start)/2;

            long res = calculateTotal(piles, mid);

            if(res<=h){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;

            }
        }
        return ans;
    }

    public long calculateTotal(int[] piles, int num){
        long totalHours = 0;
        for (int pile : piles) {
            // Calculate ceil(pile / k) using integer arithmetic
            totalHours += (pile + num - 1) / num;
        }
        return totalHours;
    }
}