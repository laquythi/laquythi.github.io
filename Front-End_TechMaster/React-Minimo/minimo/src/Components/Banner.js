import React from "react";
import "./banner.css";

class Banner extends React.Component {
  render() {
    return (
      <section className="banner container">
        <img
          src="../images/banner.png"
          title="girls on the hill"
          className="img-fluid" alt=""
        />
      </section>
    );
  }
}

export default Banner;
