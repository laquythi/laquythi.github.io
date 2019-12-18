import React from "react";
import "./Backtotop.css";

class Backtotop extends React.Component {
  render() {
    return (
      <section className="back-to-top">
        <a id="button">
          <i className="fas fa-arrow-alt-circle-up" />
        </a>
      </section>
    );
  }
}

export default Backtotop;
