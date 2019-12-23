import React from "react";
import "../App.css";

import Header from "./Header";
import Menu from "./Menu";
import Breadcrumb from "./Breadcrumb";
import Sellingproducts from "./Sellingproducts";
import Author from "./Author";
import Otherauthor from "./Otherauthor";
import Partner from "./Partner";
import Footer from "./Footer";
import Backtotop from "./Backtotop";

class Home extends React.Component {
  render() {
    return (
      <div className="home">
        <Header />
        <Menu />
        <Breadcrumb />
        <Sellingproducts />
        <Author />
        <Otherauthor />
        <Partner />
        <Footer />
        <Backtotop />
      </div>
    );
  }
}

export default Home;
