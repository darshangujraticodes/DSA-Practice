// CRUD Operation of Student Array Data

let studentsData = [
  { id: 1, name: "Harry Potter", grade: "A" },
  { id: 2, name: "Ron Weasly", grade: "B" },
  { id: 3, name: "Harmoine Granger", grade: "A+" },
  { id: 4, name: "Tanjoro kamado", grade: "C" },
];

console.log("\n");

// student data check

function checkExist(sid) {
  const checkExist = studentsData.filter((item) => item.id === sid);

  if (checkExist.length === 0) {
    return false;
  }

  return true;
}

// create student data

function addStudentData(sid, sname, sgrade) {
  const newData = { id: sid, name: sname, grade: sgrade };

  const result = checkExist(sid);

  //   console.log(result);

  if (!result) {
    // console.log("Adding New Students Data !");

    studentsData.push(newData);

    console.log(`Student Data Added Successfully! `);
  } else {
    console.log(
      `Data Already Exist for Student ID = ${sid} and Name = ${sname}  `
    );
    console.log("\n");
  }
}

// Retireve student data

function displayData(studentData) {
  console.log("\n");
  studentData.map((item) => {
    console.log(`Id = ${item.id}, Name = ${item.name}, Grade = ${item.grade}`);
  });
}

// Delete student data

function removeData(sid) {
  const result = checkExist(sid);

  if (result) {
    const removeDataList = studentsData.filter((item) => item.id != sid);

    studentsData = [...removeDataList];

    console.log(`Student Data Deleted Successfully ! `);
  } else {
    console.log(`Student Data Does not exist `);
  }
}

// Update Student Data

function updateData(sid, sname, sgrade) {
  const result = checkExist(sid);

  const newData = { name: sname, grade: sgrade };

  //   console.log(newData);

  if (result) {
    const updateStudentInfo = studentsData.map((item) =>
      item.id === sid ? { ...item, ...newData } : item
    );

    // console.log(updateStudentInfo);

    studentsData = [...updateStudentInfo];

    console.log(`Student Data Updated Successfully ! `);
  } else {
    console.log(`Student Data Does not exist `);
  }
}

addStudentData(4, "Nezuko", "A+");

addStudentData(5, "Zenitsu", "B+");

displayData(studentsData);

removeData(2);

removeData(10);

displayData(studentsData);

updateData(1, "Inoske", "C+");

displayData(studentsData);

// console.log(studentsData);
