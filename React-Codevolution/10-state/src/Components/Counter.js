import React from "react";

class Counter extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }
  onIncrement = () => {
    this.setState({
      count: this.state.count + 1
    });
  };
  render() {
      const {name , address} = this.props;
    return (
      <div className="text-center">
        <h3>{this.state.count}</h3>
        <button onClick={() => this.onIncrement()}>Increment</button>
        <h1>
          my name is {name},I come from {address}
        </h1>
      </div>
    );
  }
}

export default Counter;
