/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
     let n=nums.length;
        let j=0;
        for(let i=0;i<n;i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
};