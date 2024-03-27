class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=0,j=0, count =0;
        while(j<n){
            if(nums[j]-nums[i]==0){
                j++;
            } else if(nums[j]-nums[i]== 1){
                count = Math.max(count, j-i+1);
                j++;
            }else {
                i++;
            }
        }
        return count;

        // for (int right = 0; right < nums.length; right++) {

        //     if (nums[right] - nums[left] == 1) {
        //         answer = Math.max(answer, right - left + 1);
        //     }

        //     while (nums[right] - nums[left] > 1) {
        //         left++;
        //     }

        // }

        // return answer;
    }
}

