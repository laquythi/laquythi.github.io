import React from "react";

class Hello extends React.Component {
  render() {
    return (
      <div>
        <h1>
          hello : {this.props.name} is {this.props.isName}
        </h1>
        {this.props.children}
      </div>
    );
  }
}
export default Hello;
