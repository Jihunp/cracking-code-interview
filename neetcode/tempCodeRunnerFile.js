strs = ["eat","tea","tan","ate","nat","bat"]


/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
  let sortedWords = strs.map(word => word.split('').sort().join(''));
  console.log(sortedWords);
};

