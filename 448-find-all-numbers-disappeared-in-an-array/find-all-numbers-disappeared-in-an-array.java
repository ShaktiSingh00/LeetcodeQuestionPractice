class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        int i=0;
        while(i<n){
            int cur = nums[i]-1;

            if(nums[i] != nums[cur]){
                swap(nums,i, cur);
            }else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if (nums[j] != j + 1) {
                list.add(j + 1); // Add the missing number
            }
        }

        return list;
    }

    public void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j]; 
        num[j] = temp;
    }
}