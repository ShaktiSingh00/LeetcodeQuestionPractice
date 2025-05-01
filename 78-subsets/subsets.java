class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> result = new ArrayList<>();
        generateSubset(nums,0,result, new ArrayList<>());
        return result;
    }
    public void generateSubset(int[] nums, int i,List<List<Integer>> res, List<Integer> r){
        if(i==nums.length){
            res.add(new ArrayList<>(r));
            return;
        }

        r.add(nums[i]);
        generateSubset(nums,i+1,res,r);
        r.remove(r.size()-1);
        generateSubset(nums,i+1,res,r);
    }
}