class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
        }
            for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }

        return list;
    }
}