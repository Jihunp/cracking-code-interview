/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = (strs, map = new Map()) => {
  // edge case empty arr
  if(!strs.length) return [];

  groupWords(strs, map);
  return [...map.values()];
}

let groupWords = (strs, map) => {
  for(const word of strs) {
      const hash = getHash(word);

      const values = map.get(hash) || [];
      values.push(word);
      map.set(hash,values)
  }
}

const getHash = (phrase) => {
  //create an array filled with 0
  const frequency = new Array(26).fill(0);

  for (const char of phrase) {
      const charCode = getCode(char);

      frequency[charCode]++;
  }
  return buildHash(frequency)
}

const getCode = (char) => char.charCodeAt(0) - 'a'.charCodeAt(0);

const buildHash = (frequency) => frequency.toString();

