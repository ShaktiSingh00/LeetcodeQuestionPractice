class Solution {
    public int thirdMax(int[] nums) {
     /*   Set<Integer> set = new HashSet<>();
        int firstMax = null, secondMax = null, thirdMax = null;

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);

                if (firstMax == null || num > firstMax) {
                    thirdMax = secondMax;
                    secondMax = firstMax;
                    firstMax = num;
                } else if (secondMax == null || num > secondMax) {
                    thirdMax = secondMax;
                    secondMax = num;
                } else if (thirdMax == null || num > thirdMax) {
                    thirdMax = num;
                }
            }
        }
        return (thirdMax != null) ? thirdMax : firstMax;
        */

        int n=nums.length;
        Set<Integer> hset = new HashSet<>();
        for(int i=n-1 ;i>=0 ;i--){
            hset.add(nums[i]);
        }
         if(hset.size() < 3) return Collections.max(hset);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : hset){
            pq.offer(num);
            if(pq.size()>3){
                pq.poll();
            }
            // if(pq.size()==2){
            //     pq.poll();
            // }
        }

        
        return pq.peek();

 
    }
}
         