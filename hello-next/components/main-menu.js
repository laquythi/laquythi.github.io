import Link from "next/link";

const MainMenu = () => (
<div>
  <div className="logo">
    <a href><img src="images/logo/VEP.png" alt /></a>
  </div>
  <div className="menu-bar">
    <ul>
      <li><a href="./">Trang chủ</a></li>
      <li><a href="./about">Giới thiệu</a></li>
      <li><a href="./products">Sản phẩm</a></li>
    </ul>
  </div>
  <div className="search">
    <input type="text" placeholder="Tìm kiếm sản phẩm..." />
    <a href><i className="fas fa-search" /></a>
  </div>
</div>

)
export default MainMenu;