function removeDuplicate(arr) {
  let temp = [];

  for (let k of arr) {
    if (!temp.includes(k)) {
      temp.push(k);
    }
  }

  return temp;
}

let newArr = [1, 1, 2, 1, 1, 1, 5, 7, 9, 7, 5, 8];

console.log(removeDuplicate(newArr));
