import React from "react";

import Header from "./Header";
import Banner from "./Banner";
import Menu from "./Menu";
import AboutBreadcrumb from "./AboutBreadcrumb";
import AboutInfor from "./AboutInfor";
import AboutBookday from "./AboutBookday";
import AboutMuctieu from "./AboutMuctieu";
import Footer from "./Footer";

class About extends React.Component {
  render() {
    return (
      <div>
        <Header />
        <Banner />
        <Menu />
        <AboutBreadcrumb />
        <AboutInfor />
        <AboutBookday />
        <AboutMuctieu />
        <Footer />
      </div>
    );
  }
}

export default About;
