import React from "react";
import "./Breadcrumb.css";

class Breadcrumb extends React.Component {
  render() {
    return (
      <section className="container">
        <div className="row">
          <div className="col-lg-12 col-md-12 col-sm-12">
            <ul className="breadcrumb">
              <li>
                <a href="true">Trang Chủ</a>
              </li>
              <li>
                <a href="true">Sản Phẩm</a>
              </li>
              <li>
                <a href="true" style={{ color: "#0DC5ED" }}>
                  Giỏ Hàng
                </a>
              </li>
            </ul>
          </div>
        </div>
      </section>
    );
  }
}

export default Breadcrumb;