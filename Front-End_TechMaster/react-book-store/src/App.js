import React from 'react';
import './App.css';
import Header from "./Components/Header";
import Banner from "./Components/Banner";
import Menu from "./Components/Menu";
import Breadcrumb from "./Components/Breadcrumb";
import Sellingproducts from "./Components/Sellingproducts";
import Author from "./Components/Author";
import Otherauthor from "./Components/Otherauthor";
import Newproducts from "./Components/Newproducts";
import Nationproducts from "./Components/Nationproducts";
import Partner from "./Components/Partner";
import Footer from "./Components/Footer";
import Backtotop from "./Components/Backtotop";

class App extends React.Component{
  render(){
    return (
      <div className="App">
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
    )
  }
}

export default App;
