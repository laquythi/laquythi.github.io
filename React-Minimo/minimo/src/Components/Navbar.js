import React from "react";
import "./navbar.css";

class Navbar extends React.Component {
  render() {
    return (
      <section className="navbar">
        <div className="container">
          <nav className="navbar navbar-expand-sm navbar-light">
            <div className="container">
              <a className="navbar-brand" href="homepage.html">
                MINIMØ
              </a>
              <button
                className="navbar-toggler d-lg-none"
                type="button"
                data-toggle="collapse"
                data-target="#collapsibleNavId"
                aria-controls="collapsibleNavId"
                aria-expanded="false"
                aria-label="Toggle navigation"
              >
                <span className="navbar-toggler-icon" />
              </button>
              <div className="collapse navbar-collapse" id="collapsibleNavId">
                <ul className="navbar-nav ml-auto mt-2 mt-lg-0">
                  <li className="nav-item">
                    <a className="nav-link" href="true">
                      LIFESTYLE<span className="sr-only">(current)</span>
                    </a>
                  </li>
                  <li className="nav-item">
                    <a className="nav-link" href="true">
                      PHOTODIARY
                    </a>
                  </li>
                  <li className="nav-item">
                    <a className="nav-link" href="true">
                      MUSIC
                    </a>
                  </li>
                  <li className="nav-item">
                    <a className="nav-link" href="true">
                      TRAVEL
                    </a>
                  </li>
                </ul>
              </div>
            </div>
          </nav>
        </div>
      </section>
    );
  }
}

export default Navbar;
