import React from "react";
import "./footer.css";

class Footer extends React.Component {
  render() {
    return (
      <section className="footer container-fluid">
        <div className="container">
          <div className="row">
            <div className="col-lg-6 col-md-6 col-sm-12">
              <p>Copyright 2019 MINIMO.</p>
            </div>
            <div className="col-lg-6 col-md-6 col-sm-12">
              <div className="row">
                <div className="col-lg-6 col-md-6 col-sm-12">
                  <h6>Contact</h6>
                  <p>Phone : 0123-456-789</p>
                  <p>Address : 1600 Pennsylvania Avenue NW Washington, DC 20500</p>
                </div>
                <div className="col-lg-6 col-md-6 col-sm-12">
                  <h6>About Us</h6>
                  <a href="true">Story</a><br/>
                  <a href="true">Mission</a><br/>
                  <a href="true">Collaborators</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    );
  }
}

export default Footer;
