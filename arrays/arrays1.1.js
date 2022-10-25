// Is Unique: Implement an algorithm to 
// determine if a string has all unique characters.
// What if you cannot use additional data structures?
// 1.1

//create a string that splits each part of the string. (split)
// then check to see if each character in the string is
// my code is wack af

function checkUnique(arr) {
    low = arr.toLowerCase();
    newArray = low.split('');
    for(let i = 0; i <= arr.length; i++) {
        // if newArray[i+1] != newArray[i]; then 
        
    }
}

//book solution ask bin for help? How do I concepualize this
function isUnique(sentence) {

    let newChar = new Map(string, true);

    if (sentence.length > 128){
        return false;
        //128-character alphabet. If thinking between ASCII and Unicode. Okay to assume 256(ASCII extended)
    };
    for(let i = 0; i< sentence.length; i++) {
        let val = sentence[i];
    }
}

// geek for geek solution with the use of data strucutre. Assumes ASCII char
function uniqueCharacters(str) {
    let chArr = str.split("");
    chArr.sort();
    for (let i = 0; i < chArr.length )
}


// geek for geek solution without use of datastructures

