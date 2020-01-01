import React from "react";

class Toggle extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      isToggleOn: true
    };
  }

  // handleClick = () => {
  //   this.setState(state => ({
  //     isToggleOn: !state.isToggleOn
  //   }));
  // };

  handleClick = () => {
    this.setState(state => ({
      isToggleOn: !state.isToggleOn
    }));
  };

  render() {
    return (
      <button onClick={this.handleClick}>
        {this.state.isToggleOn ? "on" : "off"}
      </button>
    );
  }
}

export default Toggle;
