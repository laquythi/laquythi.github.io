import React from "react";

class Example extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }

  componentDidMount(){
      document.title = `you clicked ${this.state.count} times`;
  }

  componentDidUpdate(){
      document.title = `you click ${this.state.count} times`;
  }

  render() {
    return (
      <div>
        <p>you clicked {this.state.count} times</p>
        <button onClick={() => this.setState({ count: this.state.count + 1 })}>
          click me
        </button>
      </div>
    );
  }
}

export default Example;
