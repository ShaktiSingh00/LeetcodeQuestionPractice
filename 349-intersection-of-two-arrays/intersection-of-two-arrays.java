class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> hset = new HashSet<>();
        for(int num : nums1){
            hset.add(num);
        }

        for(int num : nums2){
            if(hset.contains(num)){
                list.add(num);
                hset.remove(num);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}