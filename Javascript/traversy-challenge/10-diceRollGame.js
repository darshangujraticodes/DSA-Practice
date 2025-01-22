function diceGame() {
  let dice1Val = Math.floor(Math.random() * (6 - 1 + 1) + 1);
  let dice2Val = Math.floor(Math.random() * (6 - 1 + 1) + 1);

  let diceSum = dice1Val + dice2Val;

  if (diceSum === 7 || diceSum === 11) {
    console.log(
      `Dice1 = ${dice1Val}, Dice2 = ${dice2Val}, Sum = ${diceSum} | Result = Win`
    );
  } else if (diceSum === 2 || diceSum === 3 || diceSum === 12) {
    console.log(
      `Dice1 = ${dice1Val}, Dice2 = ${dice2Val}, Sum = ${diceSum} | Result = Lose`
    );
  } else {
    console.log(
      `Dice1 = ${dice1Val}, Dice2 = ${dice2Val}, Sum = ${diceSum} | Result = Roll Again`
    );
  }
}

diceGame();
