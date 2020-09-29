import React from 'react';
import './App.css';
import Header from "./Components/Header";
import Menu from "./Components/Menu";
import Breadcrumb from "./Components/Breadcrumb";
import Sanphamdachon from "./Components/Sanphamdachon";
import Nhapthongtin from './Components/Nhapthongtin';
import Qrbutton from './Components/Qrbutton';
import Footer from './Components/Footer';
import Backtotop from './Components/Backtotop';

class App extends React.Component{
  render(){
    return(
      <div>
        <Header />
        <Menu />
        <Breadcrumb />
        <Sanphamdachon />
        <Nhapthongtin />
        <Qrbutton />
        <Footer />
        <Backtotop />
      </div>
    )
  }
}

export default App;
