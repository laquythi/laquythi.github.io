import React from "react";

class HookCounter extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }

  incrementCount = () => {
    this.setState({
      count: this.state.count + 1
    });
  };

  render() {
    return (
      <div>
        <p>you clicked {this.state.count} times</p>
        <button onClick={this.incrementCount}>
          count : {this.state.count}
        </button>
      </div>
    );
  }
}

export default HookCounter;
