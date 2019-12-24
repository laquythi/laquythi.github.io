import React from "react";
import "./Menu.css";
import { BrowserRouter as Router, Route,Link} from "react-router-dom";
import Home from "./Home";
import About from "./About";
import Products from "./Products";
import Blog from "./Blog";
import Contact from "./Contact";

class Menu extends React.Component {
  render() {
    return (
      <Router>
        <section className="menu container-fluid">
          <div className="logo">
            <a href="true">
              {/* <img src="images/logo/VEP.png" alt="true" /> */}
            </a>
          </div>
          <div className="menu-bar">
            <ul>
              <li>
                <Link to="/">Home</Link>
              </li>
              <li>
                <Link to="/about">About</Link>
              </li>
              <li>
                <Link to="/products">Products</Link>
              </li>
              <li>
                <Link to="/blog">Blog</Link>
              </li>
              <li>
                <Link to="/contact">Liên hệ</Link>
              </li>
            </ul>
          </div>
          <div className="search">
            <input type="text" placeholder="Tìm kiếm sản phẩm..." />
            {/* <a href="true">
              <i className="fas fa-search" />
            </a> */}
          </div>
          <Route path="/" exact  component={Home} />
          <Route path="/about" component={About} />
          <Route path="/products" component={Products} />
          <Route path="/blog" component={Blog} />
          <Route path="/contact" component={Contact} />
        </section>
      </Router>
    );
  }
}

export default Menu;
