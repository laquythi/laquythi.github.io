import React from "react";
import "./content2.css";

class Content2 extends React.Component {
  render() {
    return (
      <div className="content">
        <div className="container">
          <div className="row">
            <div className="col-xs-12 col-sm-12 col-md-6 col-lg-6">
              <a href="true">
                <img src="../images/girl.jpg" title="the girl" alt="true" className="img-fluid" />
              </a>
              <h6>
                <a href="true">LIFE STYLE</a>
              </h6>
              <h2>
                <a href="true">Top 10 song for running</a>
              </h2>
              <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit.
                Eligendi accusantium vel nemo tempora ipsa, deserunt voluptas
                fuga quia illum magnam tenetur velit cum commodi expedita est
                consequuntur mollitia animi itaque!
              </p>
            </div>
            <div className="col-xs-12 col-sm-12 col-md-6 col-lg-6">
              <a href="true">
                <img src="../images/the-way.png" title="the way" alt="true" className="img-fluid" />
              </a>
              <h6>
                <a href="true">LIFE STYLE</a>
              </h6>
              <h2>
                <a href="true">Cold winter days</a>
              </h2>
              <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit.
                Necessitatibus aperiam recusandae sunt architecto vitae,
                molestias sed! Totam in deleniti accusamus eveniet velit,
                molestias veniam eligendi, voluptatum amet explicabo saepe
                iusto.
              </p>
            </div>
          </div>
          <div className="text-center load-more">
            <button type="button" className="button">
              <a href="true">Load more</a>
            </button>
          </div>
        </div>
      </div>
    );
  }
}

export default Content2;
