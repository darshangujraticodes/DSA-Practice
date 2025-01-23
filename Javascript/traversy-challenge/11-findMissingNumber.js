let arr = [1, 2, 3, 4, 5, 6, 7, 9, 10];

function findMissingNumber(array) {
  let a = array[0];
  let d = array[1] - array[0];
  let n = array.length + 1;
  let an = Math.max(...array);

  let arraySum = 0;
  for (let k of arr) {
    arraySum += k;
  }

  let sequenceSum = (n / 2) * (2 * a + (n - 1) * d);
  // let sequenceSum2 = console.log(a, d, n, an, arraySum, sequenceSum2);

  return sequenceSum - arraySum;
}

console.log("Missing Value = ", findMissingNumber(arr));
