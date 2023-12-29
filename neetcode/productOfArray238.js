/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
  const output = [];
  let prefix = 1;
  let postfix = 1;

  for(let i = 0; i < nums.length; i++) {
      output[i] = prefix;
      prefix *= nums[i];
  }
  for(let j = nums.length - 2; j >= 0; j--) {
      postfix *= nums[j + 1];
      output[j] *= postfix;
  }
  return output;
};