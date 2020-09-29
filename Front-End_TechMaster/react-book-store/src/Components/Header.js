import React from "react";
import "./Header.css";

class Header extends React.Component {
  render() {
    return (
      <section className="header-top container-fluid">
        <div className="row">
          <div className="col-lg-8 col-md-8 col-sm-6 contact">
            <div className="row">
              <p>liên hệ: 0123-456-789</p>
              <p>laquythi@gmail.com</p>
            </div>
          </div>
          <div className="col-lg-4 col-md-4 col-sm-6 button">
            <div className="row">
              <a href="dangNhap.html">
                <button type="button" className="btn">
                  Đăng Nhập
                </button>
              </a>
              <a href="dangNhap.html">
                <button type="button" className="btn">
                  Tạo Tài Khoản
                </button>
              </a>
            </div>
          </div>
        </div>
      </section>
    );
  }
}

export default Header;
