import React from "react";

class Result extends React.Component {
  setStyle() {
    return {
      color: this.props.color,
      borderColor: this.props.color,
      fontSize: this.props.fontSize
    };
  }
  render() {
    return (
      <div className="col-xs-12 col-sm-12 col-md-12 col-lg-12 bottom">
        <p>
          Color : {this.props.color} -FontSize : {this.props.fontSize}px
        </p>
        <div id="content" style={this.setStyle()}>
          nội dung setting
        </div>
      </div>
    );
  }
}

export default Result;
