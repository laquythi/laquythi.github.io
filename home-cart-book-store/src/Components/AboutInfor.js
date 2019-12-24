import React from "react";
import "./AboutInfor.css";

class AboutInfor extends React.Component {
  render() {
    return (
      <div className="infor container">
        <div className="row dongtay-1">
          <div className="col-lg-8 col-md-6">
            <h3>Giới thiệu về Vietnam Ebook Project</h3>
            <p>
              Công ty TNHH Văn hóa Đông Tây, trực thuộc Trung tâm văn hóa ngôn
              ngữ Đông Tây được thành lập năm 1999. Khi ra đời chỉ là một Nhà
              sách nhỏ, hoạt động chính là bán lẻ sách, báo…. Nhưng đến hôm nay
              trước sự phát triển chung, Đông Tây đã xây dựng được riêng cho
              mình một thương hiệu với triết lý kinh doanh xuyên suốt từ những
              ngày đầu thành lập “luôn cố gắng gìn giữ văn hóa đọc, đem tri thức
              đến với mọi thế hệ người Việt, để tri thức len lỏi trong từng xóm
              làng Việt Nam”.
            </p>
          </div>
          <div className="col-lg-4 col-md-6 text-center">
            <img src="images/about/dongtay-1.png" className="img-fluid" alt />
          </div>
        </div>
        <div className="row dongtay-2" style={{ marginTop: 20 }}>
          <div className="col-lg-4 col-md-6 text-center">
            <img src="images/about/dongtay-2.png" className="img-fluid" alt />
          </div>
          <div className="col-lg-8 col-md-6">
            <p className="text-2">
              Đông Tây có hệ thống Nhà sách bán lẻ tự chọn với hàng chục ngàn
              đầu sách; một không gian yên tĩnh của thư viện café sách truyền
              thống; có thể đặt mua sách online,và đặc biệt bạn có thể đặt mượn
              sách online. Các cuốn sách bạn muốn sẽ xuất hiện ngay trước mắt
              bạn. Chỉ cần bạn có một máy tính và một thiết bị kết nối Internet.
              Với các dịch vụ của Đông Tây thì mọi trở ngại về không gian và
              thời gian giờ đây đã không còn nữa.[<a href>xem thêm</a>]
            </p>
          </div>
        </div>
      </div>
    );
  }
}

export default AboutInfor;