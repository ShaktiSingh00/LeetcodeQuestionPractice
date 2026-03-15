// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         int n=nums.length;
//         List<List<Integer>> result = new ArrayList<>();
//         generateSubset(nums,0,result, new ArrayList<>());
//         return result;
//     }
//     public void generateSubset(int[] nums, int i,List<List<Integer>> res, List<Integer> r){
//         if(i==nums.length){
//             res.add(new ArrayList<>(r));
//             return;
//         }

//         r.add(nums[i]);
//         generateSubset(nums,i+1,res,r);
//         r.remove(r.size()-1);
//      //   generateSubset(nums,i+1,res,r);
//     }
// }

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    void backtrack(int index, int[] nums, List<Integer> curr, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(curr));

        for(int i = index; i < nums.length; i++) {
            curr.add(nums[i]);              // choose
            backtrack(i + 1, nums, curr, ans);
            curr.remove(curr.size() - 1);   // backtrack
        }
    }
}