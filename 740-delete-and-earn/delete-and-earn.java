class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num,0)+num);
        }

        ArrayList<Integer> list = new ArrayList<>(hmap.keySet());

        Collections.sort(list);

        int next = -1, avoid = 0, sum = 0;

        for(int r : list){
            int maxVoid = Math.max(avoid, sum);

            if(r-1 != next){
                sum = hmap.get(r) + maxVoid;
            }else{
                sum = hmap.get(r) + avoid;
            }

            avoid = maxVoid;
            next = r;
        }
        return Math.max(avoid, sum);

    }
}