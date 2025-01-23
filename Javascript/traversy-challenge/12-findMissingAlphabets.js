let alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

let test = ["b", "c", "d", "e", "g"];

let test2 = ["O", "Q", "R", "S"];

let test3 = ["t", "u", "v", "w", "x", "z"];

function findMissingAlphabets(test) {
  let startIndex = alphabets.indexOf(test[0]);
  let endIndex = alphabets.indexOf(test[test.length - 1]);

  let missingLetter = "";

  for (let i = startIndex; i <= endIndex; i++) {
    if (!test.includes(alphabets[i])) {
      missingLetter = alphabets[i];
    }
  }

  return missingLetter;
}

console.log(findMissingAlphabets(test3));
