import React from "react";
import Search from "./Search";
import Sort from "./Sort";

class Control extends React.Component {
  render() {
    return (
      <div className="row">
        <Search />
        <Sort />
      </div>
    );
  }
}

export default Control;
