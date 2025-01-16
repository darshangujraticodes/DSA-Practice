function titleCase(string) {
  let words = string.toLowerCase().split(" ");

  //   console.log(words);

  for (let i = 0; i < words.length; i++) {
    words[i] = words[i][0].toUpperCase() + words[i].slice(1);
  }
  console.log(words);
}

titleCase("The quick brown fox jumps over the lazy dog");
