import React from "react";
//dung setState,ko dung eventHandle
class ClassCounter extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }
  render() {
    return (
      <div>
        <p>you clicked {this.state.count} times</p>
        <button onClick={() => this.setState({ count: this.state.count + 1 })}>
          Count : {this.state.count}
        </button>
      </div>
    );
  }
}

export default ClassCounter;
