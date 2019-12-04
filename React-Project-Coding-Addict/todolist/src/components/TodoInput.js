import React from "react";
import Todolist from "./Todolist";

class TodoInput extends React.Component {
  render() {
    return (
      <div>
        <h2>content inside TodoInput</h2>
        <h3>
          <Todolist />
        </h3>
      </div>
    );
  }
}

export default TodoInput;
