import React from "react";
import "./products.css";

class Products extends React.Component {
  render() {
    return (
      <div className="container">
        <div className="row">
          <div className="col-lg-2 col-md-3 col-sm-6 img text-center">
            <a href="detail-product.html">
              <img
                src="../images/hary-poster.png"
              />
            </a>
            <p>Tác Giả : JK Rowling</p>
            <p>Tái Bản : 2019</p>
            <p className="price">
              Giá : 150.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
              <a className="btn btn-primary">Detail</a>
              <a className="btn btn-warning">Add to cart</a>
          </div>
          <div className="col-lg-2 col-md-3 col-sm-6 img text-center">
            <a href="detail-product.html">
              <img
                src="../images/dacnhantam.png"
              />
            </a>
            <p>Tác Giả : D Carnegie</p>
            <p>Tái Bản : 2017</p>
            <p className="price">
              Giá : 80.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
          </div>
          <div className="col-lg-2 col-md-3 col-sm-6 img text-center">
            <a href="detail-product.html">
              <img
                src="../images/xachbalo.png"
              />
            </a>
            <p>Tác Giả : Huyền Chip</p>
            <p>Tái Bản : 2018</p>
            <p className="price">
              Giá : 100.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
          </div>
          <div className="col-lg-2 col-md-3 col-sm-6 img text-center">
            <a href="detail-product.html">
              <img
                src="../images/nhagiakim.png"
              />
            </a>
            <p>Tác Giả : P Coelho</p>
            <p>Tái Bản : 2014</p>
            <p className="price">
              Giá : 50.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
          </div>
          <div className="col-lg-2 col-md-3 col-sm-6 img text-center">
            <a href="detail-product.html">
              <img
                src="../images/start-up.png"
              />
            </a>
            <p>Tác Giả : Saul Singer</p>
            <p>Tái Bản : 2016</p>
            <p className="price">
              Giá : 120.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
          </div>
          <div className="col-lg-2 col-md-3 col-sm-6 img text-center">
            <a href="detail-product.html">
              <img
                src="../images/block-chain.png"
              />
            </a>
            <p>Tác Giả : D Hansel</p>
            <p>Tái Bản : 2016</p>
            <p className="price">
              Giá : 120.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
          </div>
        </div>
      </div>
    );
  }
}

export default Products;
