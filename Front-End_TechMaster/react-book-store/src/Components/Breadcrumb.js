import React from "react";
import "./Breadcrumb.css";

class Breadcrumb extends React.Component {
  render() {
    return (
      <div className="container">
        <div className="row">
          <div className="col-lg-12 col-md-12">
            <ul
              className="breadcrumb"
              style={{ background: "none", marginBottom: "-150px" }}
            >
              <li>
                <a href="index.html" style={{ fontSize: 28, color: "#0DC5ED" }}>
                  Trang Chủ
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    );
  }
}

export default Breadcrumb;
