import React from "react";
import "./Nhapthongtin.css";

class Nhapthongtin extends React.Component {
  render() {
    return (
      <section className="nhapThongTin">
        <div className="container">
          <div className="text-center">
            <h5>Hoàn tất thông tin trước khi đặt mua</h5>
          </div>
          <div className="row">
            <div className="col-lg-4 col-md-6 col-sm-8">
              <p>Nhập Tên</p>
              <input type="text" placeholder="Nhập tên bạn..." />
              <p>Nhập Email</p>
              <input type="email" placeholder="Nhập Email của bạn..." />
              <p>Nhập Số điện thoại</p>
              <input type="number" placeholder="Nhập Số điện thoại..." />
            </div>
            <div className="col-lg-4 col-md-6 col-sm-8">
              <p>Nhập địa chỉ</p>
              <input
                type="text"
                className="address"
                placeholder="Nhập địa chỉ giao hàng..."
              />
              <p>Nhập mã giảm giá (nếu có)</p>
              <input type="text" placeholder="Mã giảm giá..." />
              <p>Chọn Phương thức thanh toán</p>
              <div className="cash">
                <input type="radio" name="PTTT" style={{ marginTop: 10 }} />
                <p>Thanh toán bằng tiền mặt(khi nhận hàng)</p>
              </div>
              <div className="credit-card">
                <input type="radio" name="PTTT" style={{ marginTop: 10 }} />
                <p>Thanh toán bằng thẻ tín dụng</p>
              </div>
            </div>
            <div className="col-lg-4 col-md-6 col-sm-8 final">
              <p>
                Giá tiền: 582.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
              <p>
                Phí vận chuyển : 40.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
              <p>
                Giảm giá : 54.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
              <p className="money">
                Tổng Tiền : 568.000{" "}
                <span style={{ textDecoration: "underline" }}>đ</span>
              </p>
              <p className="final">
                Quý khách vui lòng xem lại thông tin trước khi đặt mua.
              </p>
              <a href="true">
                <button className="btn btn-danger">Đặt mua</button>
              </a>
            </div>
          </div>
        </div>
      </section>
    );
  }
}

export default Nhapthongtin;
