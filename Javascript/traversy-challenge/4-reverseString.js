function reverseString(stringVal) {
  const tempString = [];

  for (let i = stringVal.length - 1; i >= 0; i--) {
    tempString.push(stringVal[i]);
  }

  //   console.log(tempString.join(""));
  return tempString.join("");
}

console.log(reverseString("Hello"));
