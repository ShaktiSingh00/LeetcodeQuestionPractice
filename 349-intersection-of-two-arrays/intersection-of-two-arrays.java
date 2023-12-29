class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hset = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            hset.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(hset.contains(nums2[i])){
                list.add(nums2[i]);
                hset.remove(nums2[i]);
            }

        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }

        return res;
    }
}