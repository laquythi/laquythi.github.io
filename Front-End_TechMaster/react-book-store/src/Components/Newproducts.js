import React from "react";
import "./Newproducts.css";

class Newproducts extends React.Component {
  render() {
    return (
      <div className="new-products">
        <div className="container">
          <h3 className="text-center" style={{ paddingTop: 10 }}>
            Sản Phẩm Mới
          </h3>
          <div className="row">
            <div className="col-xl-2 col-lg-2 col-md-3 col-sm-4 col-xs-6 img text-center">
              <a href>
                <img
                  src="images/products/kyxnangditruocdamme.png"
                  title="kỹ năng đi trước đam mê"
                  alt
                />
              </a>
              <p>Tác Giả : Cal Newport</p>
              <p>Xuất Bản : 2019</p>
              <p className="new-products-price">
                Giá : 90.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-3 col-sm-4 col-xs-6 img text-center">
              <a href="detail-product.html">
                <img
                  src="images/products/block-chain.png"
                  title="blockchain"
                  alt
                />
              </a>
              <p>Tác Giả : Devan Hansel</p>
              <p>Xuất Bản : 2019</p>
              <p className="new-products-price">
                Giá : 105.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-3 col-sm-4 col-xs-6 img text-center">
              <a href="detail-product.html">
                <img
                  src="images/products/kddt-donald-trump.png"
                  title="think like a champion"
                  alt
                />
              </a>
              <p>Tác Giả : Donald Trump</p>
              <p>Xuất Bản : 2019</p>
              <p className="new-products-price">
                Giá : 70.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-3 col-sm-4 col-xs-6 img text-center">
              <a href="detail-product.html">
                <img
                  src="images/products/uber.png"
                  title="chuyến đi bão táp"
                  alt
                />
              </a>
              <p>Tác Giả : Adam Lashinsky</p>
              <p>Xuất Bản : 2019</p>
              <p className="new-products-price">
                Giá : 78.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-3 col-sm-4 col-xs-6 img text-center">
              <a href="detail-product.html">
                <img
                  src="images/products/start-up.png"
                  title="quốc gia khởi nghiệp"
                  alt
                />
              </a>
              <p>Tác Giả : Singer</p>
              <p>Xuất Bản : 2019</p>
              <p className="new-products-price">
                Giá : 86.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-3 col-sm-4 col-xs-6 img text-center">
              <a href="detail-product.html">
                <img src="images/products/python.png" title="python" alt />
              </a>
              <p>Tác Giả : O'Relly</p>
              <p>Xuất Bản : 2019</p>
              <p className="new-products-price">
                Giá : 106.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-3 col-sm-4 col-xs-6 img text-center">
              <a href="detail-product.html">
                <img
                  src="images/products/ptbt-never-eat-alone.png"
                  title="đừng bao giờ đi ăn một mình"
                  alt
                />
              </a>
              <p>Tác Giả : Keith Ferrazzi</p>
              <p>Xuất Bản : 2019</p>
              <p className="new-products-price">
                Giá : 90.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-3 col-sm-4 col-xs-6 img text-center">
              <a href="detail-product.html">
                <img src="images/products/0-1.png" title="0-1" alt />
              </a>
              <p>Tác Giả : Peter Thiel</p>
              <p>Xuất Bản : 2019</p>
              <p className="new-products-price">
                Giá : 94.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-3 col-sm-4 col-xs-6 img text-center">
              <a href="detail-product.html">
                <img
                  src="images/products/nhagiakim.png"
                  title="nha gia kim"
                  alt
                />
              </a>
              <p>Tác Giả : Paulo Coeho</p>
              <p>Xuất Bản : 2019</p>
              <p className="new-products-price">
                Giá : 82.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-3 col-sm-4 col-xs-6 img text-center">
              <a href="detail-product.html">
                <img
                  src="images/products/khcn-apple.png"
                  title="inside apple"
                  alt
                />
              </a>
              <p>Tác Giả : Adam Lashinky</p>
              <p>Xuất Bản : 2019</p>
              <p className="new-products-price">
                Giá : 105.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
            </div>
          </div>
          <div className="text-center">
            <input
              type="button"
              className="btn btn-info"
              defaultValue="Xem Thêm"
            />
          </div>
        </div>
      </div>
    );
  }
}

export default Newproducts;
