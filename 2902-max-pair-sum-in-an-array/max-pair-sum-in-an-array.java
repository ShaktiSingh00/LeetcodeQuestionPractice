// class Solution {
//     public int maxSum(int[] nums) {
//         int[] res = new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int max=0;
//             int num = nums[0];
//             while(num>0){
//             int rem = num%10;
//             if(rem>max){
//                 max =rem;
//             }
//             num=num/10;
//             }
//             res[i]=max;
//         }
//         int maxNum=0;
//         for(int j=0;j<res.length;i++){
//             if(res[j]!=res[j+1]){
//                 return -1;
//             }else{
//                 for(int i=0;i<nums.length;i++){
//                     for(int j=i+1;j<nums.length;j++){
//                         if(nums[i]+nums[j]>maxNum){
//                             maxNum=nums[i]+nums[j];
//                         }
//                     }
//                 }
//             }
//         }
//         return maxNum;
//     }
    
// }
class Solution {
    public int maxSum(int[] nums) {
        int[] res = new int[nums.length]; // To store the largest digit of each number
        
        // Find the largest digit for each number
        for (int i = 0; i < nums.length; i++) {
            int max = 0;
            int num = nums[i]; // Use the correct num (nums[i])
            while (num > 0) {
                int rem = num % 10;
                if (rem > max) {
                    max = rem;
                }
                num = num / 10;
            }
            res[i] = max; // Store the largest digit of each number
        }
        
        int maxNum = -1; // Initialize maxNum as -1 (to handle the case when no pair is found)
        
        // Check for pairs with the same largest digit
        for (int i = 0; i < res.length; i++) {
            for (int j = i + 1; j < res.length; j++) {
                // If the largest digits are the same, check the sum of the pair
                if (res[i] == res[j]) {
                    int sum = nums[i] + nums[j];
                    if (sum > maxNum) {
                        maxNum = sum; // Update maxNum if we find a larger sum
                    }
                }
            }
        }
        
        return maxNum; // Return the maximum sum or -1 if no pair was found
    }
}
