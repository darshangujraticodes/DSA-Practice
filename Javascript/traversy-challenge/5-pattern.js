/*

*****
*****
*****
*****
*****

*/

function rectanglePattern(length) {
  let str = "";
  for (let i = 0; i < length; i++) {
    for (let j = 0; j < length; j++) {
      str = str + "*";
    }
    str = str + "\n";
  }

  console.log(str);
}

rectanglePattern(5);

/*

*
**
***
****
*****

*/

function leftUpTrainglePattern(length) {
  let str = "";
  for (let i = 0; i < length; i++) {
    for (let j = 0; j < i; j++) {
      str = str + "*";
    }
    str = str + "\n";
  }

  console.log(str);
}

leftUpTrainglePattern(6);

/*

    *
   **
  ***
 ****
*****

*/

function rightUpTrainglePattern(length) {
  let str = "";
  for (let i = 0; i < length; i++) {
    for (let j = 0; j < length - i; j++) {
      str += " ";
    }

    for (let k = 0; k <= i; k++) {
      str += "*";
    }
    str += "\n";
  }

  console.log(str);
}

rightUpTrainglePattern(6);

/*

******
 *****
  ****
   ***
    **
     *

*/

function rightBottomTrainglePattern(length) {
  let str = "";
  for (let i = length; i >= 0; i--) {
    for (let j = 0; j < length - i; j++) {
      str += " ";
    }

    for (let k = 0; k <= i; k++) {
      str += "*";
    }

    str += "\n";
  }

  console.log(str);
}

rightBottomTrainglePattern(6);

/*

******
*****
****
***
**
*

*/

function leftBottomTrianglePattern(count) {
  let str = "";
  for (let i = count; i > 0; i--) {
    for (let j = 0; j < i; j++) {
      str += "*";
    }
    str += "\n";
  }

  console.log(str);
}

leftBottomTrianglePattern(5);
