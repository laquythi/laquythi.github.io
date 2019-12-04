import React from "react";
import "./header.css";

class Header extends React.Component {
  render() {
    return (
      <div>
        <div className="menu container-fluid">
          <div className="logo">
            <a href>
              <img src="../images/VEP.png" />
            </a>
          </div>
          <div className="menu-bar">
            <ul>
              <li>
                <a href="index.html">Trang chủ</a>
              </li>
              <li>
                <a href="about.html">Giới thiệu</a>
              </li>
              <li>
                <a href="products.html">Sản phẩm</a>
              </li>
              <li>
                <a href="blog.html">Blog</a>
              </li>
              <li>
                <a href="contact.html">Liên hệ</a>
              </li>
            </ul>
          </div>
          <div className="search">
            <input type="text" placeholder="Tìm kiếm sản phẩm..." />
            <a href>
              <i className="fas fa-search" />
            </a>
          </div>
        </div>
      </div>
    );
  }
}

export default Header;
