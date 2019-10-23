import React, { Component } from "react";

class SizeSetting extends Component {
  render() {
    return (
      <div className="panel panel-warning">
        <div className="panel-heading">
          <h3 className="panel-title">Size : 15px</h3>
        </div>
        <div className="panel-body">
          <button type="butotn" className="btn btn-primary">
            Giảm
          </button>
          &nbsp;
          <button type="butotn" className="btn btn-primary">
            Tăng
          </button>
        </div>
      </div>
    );
  }
}
export default SizeSetting;
