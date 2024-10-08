class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        findCombination(0,candidates,target,list, new ArrayList<>());
        return list;
    }

    public void findCombination(int index, int[] arr, int target, List<List<Integer>> list, List<Integer> ds){
        if(index == arr.length){
            if(target == 0){
                list.add(new ArrayList<>(ds));
            }
            return ;
        }
        if(arr[index]<=target){
            ds.add(arr[index]);
            findCombination(index,arr,target-arr[index],list,ds);
            ds.remove(ds.size()-1);
        }
        findCombination(index+1,arr,target,list,ds);
    }
}