import React from 'react';
import './App.css';
import Navbar from './Components/Navbar';
import Banner from './Components/Banner';
import Content1 from './Components/Content1';
import Signup from './Components/Signup';
import Content2 from './Components/Content2';
import Footer from './Components/Footer';

class App extends React.Component{
  render(){
    return(
      <div className="App">
        <Navbar />
        <Banner />
        <Content1 />
        <Signup />
        <Content2 />
        <Footer />
      </div>
    )
  }
}

export default App;
