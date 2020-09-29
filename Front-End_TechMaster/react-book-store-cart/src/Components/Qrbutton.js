import React from "react";
import "./Qrbutton.css";

class Qrbutton extends React.Component {
  render() {
    return (
      <section className="container QR">
        <a href="true">
          <img
            src="images/advesting/QR.png"
            className="img-fluid"
            title="thanh toan QR"
            alt="true"
          />
        </a>
        <div className="text-center">
          <input
            type="button"
            className="btn btn-info"
            defaultValue="Xem Thêm"
          />
        </div>
      </section>
    );
  }
}

export default Qrbutton;
