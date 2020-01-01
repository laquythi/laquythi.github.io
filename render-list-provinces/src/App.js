import React from "react";
import "./App.css";
import Data from "./Components/Data";

class App extends React.Component {
  render() {
    return (
      <div className="container">
          <Data 
          province="Thái Bình"
          district="Đông Hưng"
          population="134038"
           />
          <Data
           province="Thái Bình"
           district="Hưng Hà"
           population="154038"
          />
          <Data
           province="Thái Bình"
           district="Thái Thụy"
           population="482081"
          />
          <Data 
          province="Nam Định"
          district="Vụ Bản"
          population="75917"
          />
          <Data 
          province="Nam Định"
          district="Hải Hậu"
          population="58289"
          />
          <Data 
          province="Quảng Ninh"
          district="Vân Đồn"
          population="1408284"
          />
      </div>
    );
  }
}

export default App;
