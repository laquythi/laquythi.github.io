import React from "react";
import "./Author.css";

class Author extends React.Component {
  render() {
    return (
      <div className="container-fluid Gladwell">
        <div className="container author">
          <div className="row">
            <div className="col-lg-4 col-md-4 col-sm-6 col-xs-12 infor">
              <p className="best-seller">Tác Giả sách bán chạy</p>
              <h3>Malcom Gladwell</h3>
              <p>Journalist at The NewYorker.</p>
              <p>
                Malcolm Timothy Gladwell(sinh ngày 3 tháng 9 năm 1963) là một
                nhà báo, tác giả, và diễn giả gốc Canada sinh ra tại Anh.
                <br /> Ông là một cây bút của báo The New Yorker từ năm 1996.
                Tính đến hiện tại, ông đã viết 5 cuốn sách: Điểm Bùng Phát,Những
                kẻ xuất chúng,Trong chớp mắt,Chú chó nhìn thấy gì,David &amp;
                Goliath...[<a href>xem thêm</a>]
              </p>
            </div>
            <div className="col-lg-4 col-md-4 col-sm-6 col-xs-12 img">
              <img
                src="images/author/malcom-gladwell.png"
                title="malcom gladwell"
                className="gladwell"
                alt
              />
            </div>
            <div className="col-lg-4 col-md-4 col-sm-6 col-xs-12">
              <div className="row sanphamlienquan" style={{ marginBottom: 40 }}>
                <div className="col-md-6 col-sm-6 col-xs-6 img">
                  <a href="detail-product.html">
                    <img
                      src="images/home-sachcungtacgia/chuchonhinthaygi.png"
                      title="chú chó nhìn thấy gì"
                      alt
                    />
                  </a>
                  <p style={{ color: "#0DC5ED" }}>
                    Giá : 120.000{" "}
                    <span style={{ textDecoration: "underline" }}>đ</span>
                  </p>
                </div>
                <div className="col-md-6 col-sm-6 col-xs-6 img">
                  <a href="detail-product.html">
                    <img
                      src="images/home-sachcungtacgia/david.png"
                      title="david & goliath"
                      alt
                    />
                  </a>
                  <p style={{ color: "#0DC5ED" }}>
                    Giá :89.000{" "}
                    <span style={{ textDecoration: "underline" }}>đ</span>
                  </p>
                </div>
                <div className="col-md-6 col-sm-6 col-xs-6 img">
                  <a href="detail-product.html">
                    <img
                      src="images/home-sachcungtacgia/outliers.png"
                      style={{ marginTop: 5 }}
                      title="outliers"
                      alt
                    />
                  </a>
                  <p style={{ color: "#0DC5ED" }}>
                    Giá : 94.000{" "}
                    <span style={{ textDecoration: "underline" }}>đ</span>
                  </p>
                </div>
                <div className="col-md-6 col-sm-6 col-xs-6 img">
                  <a href="detail-product.html">
                    <img
                      src="images/home-sachcungtacgia/diembungphat.png"
                      style={{ marginTop: 5 }}
                      title="điểm bùng phát"
                      alt
                    />
                  </a>
                  <p style={{ color: "#0DC5ED" }}>
                    Giá : 102.000{" "}
                    <span style={{ textDecoration: "underline" }}>đ</span>
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Author;