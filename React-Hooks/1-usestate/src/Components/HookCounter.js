import React from "react";

//dung eventHandle,ko dung setState.
class HookCounter extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }
  onChange = () => {
    this.setState({
      count: this.state.count + 1
    });
  };

  render() {
    return (
      <div>
        <p>you clicked {this.state.count} times</p>
        <button onClick={this.onChange}>Count : {this.state.count} </button>
      </div>
    );
  }
}

export default HookCounter;
