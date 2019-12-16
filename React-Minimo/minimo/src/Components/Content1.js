import React from "react";
import "./content1.css";

class Content1 extends React.Component {
  render() {
    return (
      <section className="content">
        <div className="container">
          <h6>
            <a href="true">PHOTODIARY</a>
          </h6>
          <h2>
            <a href="true">The perfect weekend getaway</a>
          </h2>
          <p className="long-text">
            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
            eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
            ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
            aliquip ex ea commodo consequat. Duis aute irure dolor in
            reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
            pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
            culpa qui officia deserunt mollit anim id est laborum. Sed ut
            perspiciatis unde omnis iste natus error sit voluptatem accusantium
            doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo
            inventore veritatis et quasi architecto beatae vitae dicta sunt
            explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur
            aut odit aut fugit, sed quia consequuntur magni dolores eos qui
            ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui
            dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed
            quia non numquam eius modi tempora incidunt ut labore et dolore
            magnam aliquam quaerat voluptatem.
          </p>
          <h6>
            <a href="true" className="comment">
              LEAVE A COMMENT
            </a>
          </h6>
          <div className="row">
            <div className="col-xs-12 col-sm-12 col-md-6 col-lg-6 row-1">
              <a href="true">
                <img src="../images/life-style.jpg" title="life style" alt="" className="img-fluid" />
              </a>
              <h6>
                <a href="true">LIFE STYLE</a>
              </h6>
              <h2>
                <a href="true">More than just a music festival</a>
              </h2>
              <p>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
                eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
                enim ad minim veniam, quis nostrud exercitation ullamco laboris.
              </p>
            </div>
            <div className="col-xs-12 col-sm-12 col-md-6 col-lg-6 row-1">
              <a href="true">
                <img src="../images/coffee.jpg" title="hot coffee" alt="" className="img-fluid" />
              </a>
              <h6>
                <a href="true">LIFE STYLE</a>
              </h6>
              <h2>
                <a href="true">Life tastes better with coffee</a>
              </h2>
              <p>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                Tempora veniam similique molestias rerum, repudiandae voluptas
                quod asperiores praesentium adipisci ut dolores.
              </p>
            </div>
            <div className="col-xs-12 col-sm-12 col-md-6 col-lg-6 row-2">
              <a href="true">
                <img src="../images/the-gate.jpg" title="the gate" alt="" className="img-fluid" />
              </a>
              <h6>
                <a href="true">PHOTODIARY</a>
              </h6>
              <h2>
                <a href="true">American dream</a>
              </h2>
              <p>
                Lorem ipsum, dolor sit amet consectetur adipisicing elit.
                Repellat, in! Fugiat nisi laboriosam, enim commodi modi culpa
                quaerat earum obcaecati reiciendis doloribus saepe quae nam
                sequi est velit repudiandae architecto?
              </p>
            </div>
            <div className="col-xs-12 col-sm-12 col-md-6 col-lg-6 row-2">
              <a href="true">
                <img src="../images/the-man.png" title="the man" alt="" className="img-fluid" />
              </a>
              <h6>
                <a href="true">PHOTODIARY</a>
              </h6>
              <h2>
                <a href="true">A day exploring the Alps</a>
              </h2>
              <p>
                Lorem, ipsum dolor sit amet consectetur adipisicing elit.
                Repudiandae pariatur quae veniam magni nulla consequatur
                assumenda, deserunt sed eos maxime quis id corporis alias sint
                impedit facilis odit nesciunt? Impedit?
              </p>
            </div>
          </div>
        </div>
      </section>
    );
  }
}

export default Content1;
