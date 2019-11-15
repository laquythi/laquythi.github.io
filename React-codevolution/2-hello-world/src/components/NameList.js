import React from "react";
import Person from "./Person";

function NameList() {
  const names = ['Thi','Trang','Anh','Phong','Thi'];
  const persons = [
    {
      id: 1,
      name: "Thi",
      skill: "Javascript"
    },
    {
      id: 2,
      name: "Trang",
      skill: "Tester"
    },
    {
      id: 3,
      name: "Thu",
      skill: "ReactJS"
    }
  ];
const nameList = names.map((name,index) => <h2 key={index}> {index} {name}</h2> );
  return <div>{nameList}</div>;
}

export default NameList;
