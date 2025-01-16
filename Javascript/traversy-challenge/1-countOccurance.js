let stringVal = "hello world";

function countOccurrance(stringData, letter) {
  let count = 0;

  for (let i = 0; i < stringData.length; i++) {
    // console.log(stringData[i]);

    if (stringData[i] === letter) {
      count += 1;
    }
  }

  return count;
}

console.log(countOccurrance(stringVal, "l"));
