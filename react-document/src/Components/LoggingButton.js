import React from "react";

class LoggingButton extends React.Component {
  handleClick = () => {
    console.log("this is:", this);
  };
  render() {
    return (
      <div>
        <button onClick={this.handleClick}>Click me</button>
      </div>
    );
  }
}

export default LoggingButton;