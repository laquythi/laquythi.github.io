import React from "react";
import "./AboutMuctieu.css";

class AboutMuctieu extends React.Component {
  render() {
    return (
      <div className="container muc-tieu" style={{ marginTop: 50 }}>
        <div className="row">
          <div className="text-center">
            <h3>
              Vietnam Ebook Project là 1 dự án hoạt động vì cộng đồng,với mục
              tiêu
            </h3>
            <p>
              - Số hóa 1.000 đầu sách mỗi năm.
              <br />
              - Phiên dịch 150-200 đầu sách mỗi năm..
              <br />
              - Tạo 1 tủ sách cho mỗi bản làng Tây Bắc,Tây Nguyên,Nam Trung Bộ..
              <br />
              - Để thực hiện được những mục tiêu trên,chúng tôi rất cần sự chung
              tay,ủng
              <br />
              hộ từ phía các bạn học sinh , sinh viên, qúy độc giả, nhà xuất bản
              cùng các nhà hảo tâm...
              <br />
            </p>
            <span style={{ fontSize: 25, fontWeight: "bold" }}>
              Tham gia cùng chúng tôi để làm thế giới tốt đẹp hơn.
            </span>
            <div>
              <input
                type="button"
                className="btn btn-info"
                style={{ marginTop: 25 }}
                defaultValue="Tham Gia Ngay"
              />
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default AboutMuctieu;
