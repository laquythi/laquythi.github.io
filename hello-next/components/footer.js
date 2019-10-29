import Link from "next/link";

const Footer = () => (
  <footer>
    <div className="ft">
      <div className="about-me">
        <h3>
          chủ sở hữu website
        </h3>
        <p>Công ty cổ phẩn VEB</p>
        <p>GPKD : 3400 2051 45921</p>
        <p>Ngày cấp : 27-07-2019</p>
        <p>Nơi Cấp : Sở Công Thương HN</p>
      </div>
      <div className="infor-me">
        <h3>
          Địa chỉ
        </h3>
        <p>Văn phòng công ty</p>
        <p>Tổng kho</p>
        <p>Điểm hỗ trợ</p>
      </div>
      <div className="contact">
        <p>ghi</p>
      </div>
    </div>


    <style jsx>{`
      .ft{
        display:flex;
        background-color:
      }
      .ft .about-me{
         
      }
      .ft .infor-me{
        
      }
      a {
        color: green;
      }
    `}</style>
  </footer>
);

export default Footer;
//4: trong components footer chỉ có 1 thẻ p,trong đó chứa nội dung 
  //create by robin huy
