import React from "react";
import "./Banner.css";

class Banner extends React.Component {
  render() {
    return (
      <section className="banner">
        <img
          src="images/banner/banner.png"
          className="img-fluid"
          alt
          style={{ width: "100%" }}
        />
        <div className="text-center">
          <a href="products.html">
            <input
              type="button"
              className="btn btn-info"
              defaultValue="Xem nhanh"
            />
          </a>
        </div>
      </section>
    );
  }
}

export default Banner;
