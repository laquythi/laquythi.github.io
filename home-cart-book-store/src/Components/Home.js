import React from "react";
// import "../App.css";
import "./style.css";

import Header from "./Header";
import Banner from "./Banner";
import Menu from "./Menu";
import Breadcrumb from "./Breadcrumb";
import Sellingproducts from "./Sellingproducts";
import Newproducts from "./Newproducts";
import Nationproducts from "./Nationproducts";
import Author from "./Author";
import Otherauthor from "./Otherauthor";
import Partner from "./Partner";
import Footer from "./Footer";
import Backtotop from "./Backtotop";

class Home extends React.Component {
  render() {
    return (
        <div>
          <Header />
          <Banner />
          <Menu />
          <Breadcrumb />
          <Sellingproducts />
          <Author />
          <Otherauthor />
          <Newproducts />
          <Nationproducts />
          <Partner />
          <Footer />
          <Backtotop />
        </div>
    );
  }
}

export default Home;
