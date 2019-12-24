import React from "react";
import "./AboutBreadcrumb.css";

class AboutBreadcrumb extends React.Component {
  render() {
    return (
      <div className="container">
        <div className="row">
          <div className="col-lg-12 col-md-12">
            <ul className="breadcrumb">
              <li>
                <a href="index.html">Trang Chủ</a>
              </li>
              <li>
                <a href="true" style={{ color: "#0DC5ED" }}>
                  Giới Thiệu
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    );
  }
}

export default AboutBreadcrumb;
