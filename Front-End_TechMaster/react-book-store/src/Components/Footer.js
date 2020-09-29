import React from "react";
import "./Footer.css";

class Footer extends React.Component {
  render() {
    return (
      <section className="footer">
        <div className="container">
          <div className="row">
            <div className="col-xl-3 col-lg-6 col-md-6 col-sm-6 ft">
              <h4>Chủ sở hữu website</h4>
              <p>Công ty cổ phẩn VEB</p>
              <p>GPKD : 3400 2051 45921</p>
              <p>Ngày cấp : 27-07-2019</p>
              <p>Nơi Cấp : Sở Công Thương HN</p>
            </div>
            <div className="col-xl-3 col-lg-6 col-md-6 col-sm-6 ft">
              <h4>Địa chỉ</h4>
              <a href="true">
                Văn phòng công ty
                <br />
              </a>
              <a href="true">
                Tổng kho
                <br />
              </a>
              <a href="true">
                Điểm hỗ trợ
                <br />
              </a>
            </div>
            <div className="col-xl-3 col-lg-6 col-md-6 col-sm-6 ft">
              <h4>Đổi trả hàng</h4>
              <a href="true">
                7 ngày đầu tiên
                <br />
              </a>
              <a href="true">
                8-30 ngày
                <br />
              </a>
              <a href="true">
                Sau 30 ngày
                <br />
              </a>
            </div>
            <div className="col-xl-3 col-lg-6 col-md-6 col-sm-6 ft">
              <h4>Chính sách hậu mãi</h4>
              <a href="true">
                Đối với khách có thẻ thành viên
                <br />
              </a>
              <a href="true">
                Đối với khách vãng lai
                <br />
              </a>
              <a href="true">
                Đối với CB &amp; CNV
                <br />
              </a>
            </div>
          </div>
        </div>
      </section>
    );
  }
}

export default Footer;