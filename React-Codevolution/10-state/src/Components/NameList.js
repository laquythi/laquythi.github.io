import React from "react";

class NameList extends React.Component {
  render() {
    const Name = [
      {
        id: 1,
        name: "thi la quy",
        age: 29
      },
      {
        id: 2,
        name: "la quy phong",
        age: 8
      },
      {
        id: 3,
        name: "la hong anh",
        age: 13
      },
      {
        id: 4,
        name: "la trang",
        age: 24
      }
    ];
    const NameList = Name.map(anything => (
      <h1>
        my name is {anything.name},I/m {anything.age} year old
      </h1>
    ));
    return <div>{NameList}</div>;
  }
}

export default NameList;
