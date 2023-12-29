/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums, maxScore = 0) {
    const numSet = new Set(nums);
        for(const num of [...numSet]) {
            const prevNum = num - 1; // look for previous number
            if(numSet.has(prevNum)) continue;
            // if number exists in set skip, to next number
            //initialize for current number 
            let [currNum, score] = [num, 1];
    
            //check if there is a streak
            const isStreak = () => numSet.has(currNum + 1);
            while(isStreak()) {
                currNum++;
                score++;
            }
        maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }