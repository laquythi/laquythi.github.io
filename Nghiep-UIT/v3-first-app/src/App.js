import React, {Component} from "react";
import "./App.css";
import Header from "./components/Header";

function App() {
  return (
    <div>
      <h1>App Component</h1>
      <Header />
      <div className="row">
        <div className="col-xs-6 col-sm-6 col-md-6 col-lg-6"></div>
        <div className="col-xs-6 col-sm-6 col-md-6 col-lg-6"></div>
      </div>
    </div>
  );
}

export default App;
