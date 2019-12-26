import React from "react";

class Welcome extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      message: "congratulation"
    };
  }
  changeMessage = () => {
      this.setState({
          message : 'good luck !'
      })
  }
  render() {
    return (
      <div>
        <h1>{this.props.name}</h1>
        <h2>{this.state.message}</h2>
        <button onClick={this.changeMessage}>Click Me</button>
      </div>
    );
  }
}

export default Welcome;
