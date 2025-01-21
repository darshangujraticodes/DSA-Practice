function displayLikes(nameArray) {
  let arrayCount = nameArray.length;

  //   console.log(arrayCount);

  if (arrayCount == 1) {
    console.log(`${nameArray[0]} like this `);
    return;
  }

  if (arrayCount == 2) {
    console.log(`${nameArray[0]}, and ${nameArray[1]} like this `);
    return;
  }

  if (arrayCount == 3) {
    console.log(
      `${nameArray[0]}, ${nameArray[1]} and ${nameArray[2]} like this `
    );
    return;
  }
  if (arrayCount > 3) {
    console.log(
      `${nameArray[0]}, ${nameArray[1]} and ${arrayCount - 2} others like this `
    );
    return;
  }

  if (arrayCount == 0) {
    console.log("No one likes this");
    return;
  }
}

displayLikes(["Peter"]);
displayLikes(["Jacob", "Alex"]);
displayLikes(["Alex", "Jacob", "Mark"]);
displayLikes(["Max", "John", "Mark", "Sahil"]);
displayLikes(["Alex", "Jacob", "Mark", "Max", "Jill"]);
displayLikes([]);
