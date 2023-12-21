/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */

//bucket sort problem

var topKFrequent = function (nums, k) {
  count = {};
  //bucket sorts linear.
  // create an array to hold frequencys
  for (let i = 0; i < nums.length; i++) {
    //check if count already exists if not add it

    if (count.hasOwnProperty(nums[i])) {
      count[nums[i]] += 1;
    } else {
      count[nums[i]] = 1;
    }
  }

  // object.keys() method and the map() method to transform
  // an object into an array of key value pairs.
  // each key value pair is represented as an array
  let result = Object.keys(count).map((key) => [Number(key), count[key]]);
  let sortedResult = result.sort((a, b) => {
    return b[1] - a[1];
  });

  let output = [];
  for (let i = 0; i < nums.length; i++) {
    output.push(sortedResult[i][0]);
  }
  return output;
};

(nums = [1, 1, 1, 2, 2, 3]), (k = 2);

topKFrequent(nums, k);
