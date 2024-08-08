/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
     for (let i = digits.length - 1; i >= 0; i--) {
        if (digits[i] != 9) {
            digits[i]++;
            return digits;
        } else {
            digits[i] = 0;
        }
    }
    
    // If all the digits were 9, we need an array with one more digit, starting with 1 followed by all 0s
    let arr = new Array(digits.length + 1).fill(0);
    arr[0] = 1;
    return arr;
};