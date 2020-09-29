import React from "react";
import "./footer.css";

class Footer extends React.Component {
  render() {
    return (
      <section className="footer container-fluid">
        <div className="container">
          <div className="row">
            <div className="col-lg-6 col-md-6 col-sm-12">
              <p className="copyright">Copyright 2019 MINIMØ.</p>
            </div>
            <div className="col-lg-6 col-md-6 col-sm-12">
              <div className="row">
                <div className="col-lg-6 col-md-6 col-sm-12">
                  <h6>Contact</h6>
                  <p>0123-456-789</p>
                  <p>theminimo@gmail.com</p>
                  <p className="address">1600 Pennsylvania Avenue NW</p>
                </div>
                <div className="col-lg-6 col-md-6 col-sm-12">
                  <h6>About Us</h6>
                  <p><a href="true">Story</a></p>
                  <p><a href="true">Mission</a></p>
                  <p><a href="true">Collaborators</a></p>
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
