import React from "react";
import "./Menu.css";

class Menu extends React.Component {
  render() {
    return (
      <section className="menu container-fluid">
        <div className="logo">
          <a href="true">
            <img src="images/logo/VEP.png" alt="true" />
          </a>
        </div>
        <div className="menu-bar">
          <ul>
            <li>
              <a href="true">Trang chủ</a>
            </li>
            <li>
              <a href="true">Giới thiệu</a>
            </li>
            <li>
              <a href="true">Sản phẩm</a>
            </li>
            <li>
              <a href="true">Blog</a>
            </li>
            <li>
              <a href="true">Liên hệ</a>
            </li>
          </ul>
        </div>
        <div className="search">
          <input type="text" placeholder="Tìm kiếm sản phẩm..." />
          <a href="true">
            <i className="fas fa-search" />
          </a>
        </div>
      </section>
    );
  }
}

export default Menu;