class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        backTrack(list, new ArrayList<>(),nums,0);

        return list; 
    }

    public void backTrack(List<List<Integer>> resultSet, List<Integer> tempSet, int[] nums, int start){
        resultSet.add(new ArrayList<>(tempSet));
        for(int i=start;i<nums.length;i++){
             tempSet.add(nums[i]);
            backTrack(resultSet, tempSet, nums, i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }

}