function highScoringWord(str) {
  //   console.log(str);

  const letterString = "abcdefghijklmnopqrstuvwxyz";

  let splitString = str.toLowerCase().split(" ");

  let wordScoreArray = [];
  let wordScoreObject = {};
  let tempIndex = 0;
  let sum = 0;
  for (let i of splitString) {
    for (j of i) {
      tempIndex = letterString.indexOf(j) + 1;
      //   console.log(j, " = ", tempIndex);
      sum += tempIndex;
      //   console.log(sum);
    }
    wordScoreArray.push(sum);
    wordScoreObject[i] = sum;
    sum = 0;
  }

  console.log(
    // wordScoreArray,
    wordScoreObject,
    splitString[wordScoreArray.indexOf(Math.max(...wordScoreArray))]
  );

  //   console.log(splitString);
}

highScoringWord("super human");

highScoringWord("man i need a taxi up to ubud");

highScoringWord("A Quick Brown Fox jump over the Lazy Dog");
