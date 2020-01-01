import React from "react";

class Data extends React.Component {
  render() {
    return (
      <div>
        <table className="table table-hover">
          <thead>
            <tr className="row">
              <th className="col-lg-4">Tỉnh</th>
              <th className="col-lg-4">Huyện</th>
              <th className="col-lg-4">Dân Số (Người)</th>
            </tr>
          </thead>
          <tbody>
            <tr className="row">
              <td className="col-lg-4">{this.props.province}</td>
              <td className="col-lg-4">{this.props.district}</td>
              <td className="col-lg-4">{this.props.population}</td>
            </tr>
          </tbody>
        </table>
      </div>
    );
  }
}

export default Data;
