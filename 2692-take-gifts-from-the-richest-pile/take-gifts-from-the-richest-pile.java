class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int q : gifts){
            pq.offer((long)q);
        }

        long max=0;
        for(int j=0;j<k;j++){
            long maxEle = pq.poll();
            pq.offer((long) Math.sqrt(maxEle));
        }

        while(!pq.isEmpty()){
            max += pq.poll();
        }

        return max;
    }
}