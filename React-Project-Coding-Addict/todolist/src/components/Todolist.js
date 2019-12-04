import React from "react";
import Todoitem from "./Todoitem";

class Todolist extends React.Component {
  render() {
    return (
      <div>
        <h4>content inside TodoList</h4>
        <Todoitem />
      </div>
    );
  }
}

export default Todolist;
