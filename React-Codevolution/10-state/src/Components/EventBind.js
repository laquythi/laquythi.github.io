import React from "react";

class EventBind extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      message: "hello"
    };
    this.changeMessage = this.changeMessage.bind(this);
  }
  changeMessage(){
    this.setState({
      message: "good bye"
    });
    console.log(this);
  }
  render() {
    return (
      <div className="text-center">
        <h1>{this.state.message}</h1>
        {/* <button onClick={this.changeMessage.bind(this)}>Click Me</button> */}
        <button onClick={this.changeMessage}>Click Me</button>
      </div>
    );
  }
}

export default EventBind;
