function findMax(arrayValue) {
  let tempVal = arrayValue[0];

  for (k of arrayValue) {
    if (k > tempVal) tempVal = k;
  }

  return tempVal;
}

console.log(findMax([1, 8, 54, 64, 684, 54, 656, 98, 6546]));
