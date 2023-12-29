

function bucketSort(arr, n) {
  if (n <= 0) {
    return;
  }
  let buckets = new Array(n);
  for (let i = 0; i < n; i++) {
    buckets[i] = [];
  }

  //put array in buckets
  for( let i = 0; i < n; i++) {
    let index = arr[i] * n;
    let floor = math.floor(index);
    buckets[floor].push(arr[i]);
  }

  //sort the individual buckets
  for(let i = 0; i < n; i++) {
    buckets[i].sort((a,b) => a-b)
    //geeks for geeks writes it as
    // function(a,b) {return a-b;}
  }

  //put all bucket items into arr
  let index = 0;
  for (let i = 0; i < n; i++) {
    for (let j = 0; j < buckets[i].length; j++) {
      arr[index++] = buckets[i][j];
    }
  }
}

// test code

let arr = [0.8, 0.2, 0.6, 0.33, 0.4, 0.7];
let n = arr.length;
bucketSort(arr, n);
console.log("sorted array is <br>");
for(let element of arr.values()) {
  console.log(element + " ");
};