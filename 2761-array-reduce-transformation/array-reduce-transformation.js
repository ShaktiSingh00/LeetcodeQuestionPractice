/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let arr = init;
    for(const n of nums){
        arr = fn(arr,n);
    }

    return arr;
};