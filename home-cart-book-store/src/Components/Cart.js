import React from "react";
import "./style.css";

import Header from "./Header";
import Menu from "./Menu";
import Breadcrumb from "./Breadcrumb";
import Sanphamdachon from "./Sanphamdachon";
import Nhapthongtin from "./Nhapthongtin";
import Qrbutton from "./Qrbutton";
import Footer from "./Footer";
import Backtotop from "./Backtotop";

class Cart extends React.Component {
  render() {
    return (
      <div className="cart">
        <Header />
        <Menu />
        <Breadcrumb />
        <Sanphamdachon />
        <Nhapthongtin />
        <Qrbutton />
        <Footer />
        <Backtotop />
      </div>
    );
  }
}

export default Cart;
