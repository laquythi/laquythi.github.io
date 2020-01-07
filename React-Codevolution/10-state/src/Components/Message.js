import React from "react";

class Message extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      message: "memories phamm"
    };
    // this.changeMessage = this.changeMessage.bind(this);
  }
  changeMessage() {
    this.setState({
      message: "autumn phamm"
    });
  }
  render() {
    return (
      <div>
        <p>{this.state.message}</p>
        <button onClick={() => this.changeMessage()}>Click Me</button>
      </div>
    );
  }
}

export default Message;
