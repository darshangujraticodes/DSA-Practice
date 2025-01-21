let arr1 = [1, 2, 4, 95, 8, 95, 9, 9, 484646];
let arr2 = [8, 95, 9, 5, , 9, 78, 484646, 684646];

function arrayIntersection(arr1, arr2) {
  let temp = [];
  let temp2 = [];

  //   my logic
  //   for (let i of arr1) {
  //     for (let j of arr2) {
  //       if (i === j) {
  //         if (!temp2.includes(i)) temp2.push(i);
  //       }
  //     }
  //   }

  // More optimization method

  for (let i of arr1) {
    if (arr2.includes(i) && !temp.includes(i)) temp.push(i);
  }

  console.log(temp, temp2);

  //   return temp;
}

arrayIntersection(arr1, arr2);
