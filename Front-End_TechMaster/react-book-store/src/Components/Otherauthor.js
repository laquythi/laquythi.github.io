import React from "react";
import "./Otherauthor.css";

class Otherauthor extends React.Component {
  render() {
    return (
      <div className="other-author">
        <div className="container">
          <p
            style={{
              textAlign: "center",
              fontWeight: "bold",
              paddingTop: 10,
              fontSize: 34
            }}
          >
            Các Tác Giả Khác
          </p>
          <div className="row">
            <div className="col-xl-2 col-lg-2 col-md-4 col-sm-6 col-xs-6 ">
              <div className="text-center">
                <a href="detail-product.html">
                  <img
                    src="images/author/jk-rowling.png"
                    title="JK Rowling"
                    alt
                  />
                </a>
                <p>JK Rowling</p>
              </div>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-4 col-sm-6 col-xs-6">
              <div className="text-center">
                <a href="detail-product.html">
                  <img
                    src="images/author/keith-ferrazzi.png"
                    title="keith-ferrazzi"
                    alt
                  />
                </a>
                <p>Keith Ferrazzi</p>
              </div>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-4 col-sm-6 col-xs-6">
              <div className="text-center">
                <a href="detail-product.html">
                  <img
                    src="images/author/luuquangvu.png"
                    title="lưu quang vũ"
                    alt
                  />
                </a>
                <p>Lưu Quang Vũ</p>
              </div>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-4 col-sm-6 col-xs-6">
              <div className="text-center">
                <a href="detail-product.html">
                  <img
                    src="images/author/henry-kissingger.png"
                    title="henry kissinger"
                    alt
                  />
                </a>
                <p>Henry Kissingger</p>
              </div>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-4 col-sm-6 col-xs-6">
              <div className="text-center">
                <a href="detail-product.html">
                  <img
                    src="images/author/paulo-coeho.png"
                    title="paulo coeho"
                    alt
                  />
                </a>
                <p>Paulo Coeho</p>
              </div>
            </div>
            <div className="col-xl-2 col-lg-2 col-md-4 col-sm-6 col-xs-6">
              <div className="text-center">
                <a href="detail-product.html">
                  <img src="images/author/chulai.png" title="chu lai" alt />
                </a>
                <p>Chu Lai</p>
              </div>
            </div>
          </div>
          <div className="text-center" style={{ marginTop: "-15px" }}>
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

export default Otherauthor;
