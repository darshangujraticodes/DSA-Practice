let numData = [1, 2, 3, 4, 5];
let numData2 = [-1, 0, 1, 2, 3, 4];

function sumOfEvenSquares(arrayVal) {
  let sum = 0;
  //   console.log(arrayVal);

  //   for (let k of arrayVal) {
  //     if (k % 2 == 0) sum += k ** 2;
  //   }

  //   chain function

  const evenSquares = arrayVal
    .filter((i) => i % 2 == 0)
    .map((i) => i ** 2)
    .reduce((acc, currVal) => acc + currVal, 0);

  return evenSquares;
}

console.log(sumOfEvenSquares(numData));
console.log(sumOfEvenSquares(numData2));
