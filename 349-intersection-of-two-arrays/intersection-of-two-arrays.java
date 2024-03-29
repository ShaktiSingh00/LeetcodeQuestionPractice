class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> hset = new HashSet<>();
       List<Integer> list = new ArrayList<>();
       for(int num : nums1){
           hset.add(num);
       }
       for(int num: nums2){
           if(hset.contains(num)){
               list.add(num);
               hset.remove(num);
           }
       }
       int[] res = new int[list.size()];
       for(int i=0;i<list.size();i++){
           res[i]=list.get(i);
       }
       return res;
    }
}