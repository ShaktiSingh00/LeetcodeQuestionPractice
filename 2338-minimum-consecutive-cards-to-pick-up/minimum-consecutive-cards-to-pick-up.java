class Solution {
    public int minimumCardPickup(int[] cards) {
        int n = cards.length;
        HashSet<Integer> hset = new HashSet<>();
        int l=0;
        int min=Integer.MAX_VALUE;

        for(int r=0;r<n;r++){
            if(!hset.contains(cards[r])){
                hset.add(cards[r]);
            }else{
                while(cards[r] != cards[l]){
                    
                    hset.remove(cards[l]);
                    l++;
                }
                min = Math.min(min,r-l+1);

                hset.remove(cards[l]);
                l++;
            }
            hset.add(cards[r]);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}