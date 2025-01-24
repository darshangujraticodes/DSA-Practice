// Array high order Methods

// Map

const numberData = [1, 5, 8, 7, 9, 4, 2, 6, 3];

// map is used when we want new copy array of same elements or Arithmatic operation of Elements

const newNumData = numberData.map((i) => {
  return i * 5;
});

console.log("Map() = ", newNumData);

// filter

// filter is used to fetch element of certain conditions

const filterAbove4 = numberData.filter((i) => {
  return i > 4;
});

console.log("filter() = ", filterAbove4);

// reduce

//

// numberData.reduce((accumulator, currentVal) => {
//   return accumulator + currentVal;
// }, initialValue);

const reduceData = numberData.reduce((accumulator, currentVal) => {
  return accumulator + currentVal;
}, 0);

console.log("reduce() = ", reduceData);

// forEach

numberData.forEach((i) => console.log(i));

// includes

// it help to test whether data is present or not in array output will be in true or false

console.log(
  "check includes(45)  = ",
  numberData.includes(45),
  "check includes(9)  = ",
  numberData.includes(9)
);

// sort

console.log(numberData.sort());

//
