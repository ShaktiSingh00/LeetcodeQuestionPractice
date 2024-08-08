/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let n = nums.length;
    let j=0;
    for(let i=0;i<n;i++){
        if(nums[i]==val){
            continue;
        }
        nums[j++] = nums[i];
    }
    return j;
};