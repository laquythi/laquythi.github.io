import React from "react";
import "./Sellingproducts.css";

class Sellingproducts extends React.Component {
  render() {
    return (
      <div className="container sanPhamBanChay">
        <h3>Sản Phẩm Bán Chạy</h3>
        <div className="row">
          <div className="col-lg-2 col-md-3 col-sm-6 img text-center">
            <a href="detail-product.html">
              <img
                src="images/products/hary-poster.png"
                title="hary-poster"
                alt
              />
            </a>
            <p>Tác Giả : JK Rowling</p>
            <p>Tái Bản : 2019</p>
            <p className="price">
              Giá : 150.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
          </div>
          <div className="col-lg-2 col-md-3 col-sm-6 img text-center">
            <a href="detail-product.html">
              <img
                src="images/products/dacnhantam.png"
                title="dacnhantam"
                alt
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
                src="images/products/xachbalo.png"
                title="xach ba lo len va di"
                alt
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
                src="images/products/nhagiakim.png"
                title="nhà giả kim"
                alt
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
                src="images/products/start-up.png"
                title="quốc gia khởi nghiệp"
                alt
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
                src="images/products/block-chain.png"
                title="blockchain"
                alt
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

export default Sellingproducts;
