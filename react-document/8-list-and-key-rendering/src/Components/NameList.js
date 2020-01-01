// import React from "react";

// class NameList extends React.Component {
//   render() {
//     const names = ["thi", "anh", "phong", "trang"];
//     return (
//       <div>
//         {names.map(name => (
//           <h1>{name}</h1>
//         ))}
//       </div>
//     );
//   }
// }

// export default NameList;

import React from "react";
// import Person from "./Person";

class NameList extends React.Component {
  render() {
    const persons = [
      {
        name: "thi",
        age: 28,
        job: "IT"
      },
      {
        name: "trang",
        age: "23",
        job: "tester"
      },
      {
        name: "anh",
        age: 12,
        job: "student"
      },
      {
        name: "phong",
        age: 7,
        job: "student"
      }
    ];
const personList = persons.map(person => <Person person={person} />)
    return (
      <div>
          {personList}
      </div>
    );
  }
}

export default NameList;
