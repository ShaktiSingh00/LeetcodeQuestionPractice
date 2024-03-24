class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int res = 0;
        for(int no : nums){
            hmap.put(no, hmap.getOrDefault(no,0)+1);
        }
        for(int no : nums){
            if(hmap.get(no)>1){
                res= no;

            }
        }
        return res;
    }
}