import React from "react";
import "./App.css";
import { BrowserRouter as Router,Route,Link } from "react-router-dom";
import Home from "./Components/Home";
import About from "./Components/About";
import Contact from "./Components/Contact";

class App extends React.Component {
  render() {
    return (
      <Router>
        <div className="App">
          <nav className="navbar bg-light">
            {/* Links */}
            <ul className="navbar-nav">
              <li className="nav-item">
                <Link to="/">Home</Link>
              </li>
              <li className="nav-item">
                <Link to="/about">ve chung toi</Link>
              </li>
              <li className="nav-item">
                <Link to="/contact">lien he</Link>
              </li>
            </ul>
          </nav>
          <Route path="/" component={Home} />
          <Route path="/about" component={About} />
          <Route path="/contact" component={Contact} />

          {/* format document,component nó chuyển thành Component,nên ko render ra được nội dung. */}
        </div>
      </Router>
    );
  }
}

export default App;
