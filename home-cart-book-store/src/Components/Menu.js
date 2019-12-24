import React from "react";
import "./Menu.css";
import { BrowserRouter as Router, Route,Link} from "react-router-dom";
import Home from "./Home";
import About from "./About";

class Menu extends React.Component {
  render() {
    return (
      <Router>
        <section className="menu container-fluid">
          <div className="logo">
            <a href="true">
              <img src="images/logo/VEP.png" alt="true" />
            </a>
          </div>
          <div className="menu-bar">
            <ul>
              <li>
                <Link to="/">Trang chủ</Link>
              </li>
              <li>
                <Link to="/About">Giới thiệu</Link>
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
        <Route path="/" exact Component={Home} />
        <Route path="/About" Component={About} />
      </Router>
    );
  }
}

export default Menu;
