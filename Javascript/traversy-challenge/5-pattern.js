/*

*****
*****
*****
*****
*****

*/

let str = "";

function rectangle(length) {
  for (let i = 0; i < length; i++) {
    for (let j = 0; j < length; j++) {
      str = str + "*";
    }
    str = str + "\n";
  }

  console.log(str);
}

rectangle(5);

/*

*
**
***
****
*****

*/
