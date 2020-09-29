import React from "react";
import "./Menu.css";

class Menu extends React.Component {
  render() {
    return (
      <section className="menu container-fluid">
        <div className="logo">
          <a href>
            <img src="images/logo/VEP.png" alt />
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
      </section>
    );
  }
}

export default Menu;
