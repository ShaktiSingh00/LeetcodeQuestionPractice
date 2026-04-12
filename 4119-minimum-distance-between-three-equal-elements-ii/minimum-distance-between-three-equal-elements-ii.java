class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        HashMap<Integer, List<Integer>> hmap = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i], new ArrayList<>());
            }
            hmap.get(nums[i]).add(i);
        }

        int minDistance = Integer.MAX_VALUE;
        boolean found = false;

        for(List<Integer> list : hmap.values()){
            if(list.size() >= 3){
                found = true;
                // CHANGED: i <= list.size() - 3
                for(int i = 0; i <= list.size() - 3; i++){
                    int sum = 2 * (list.get(i + 2) - list.get(i));
                    minDistance = Math.min(sum, minDistance);
                }
            }
        }
        return found ? minDistance : -1;
    }
}