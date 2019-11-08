import React from "react";
import logo from "./logo.svg";
import "./App.css";
import Greet from "./components/Greet";
import Welcome from "./components/Welcome";
import Hello from "./components/Hello";
import Message from "./components/Message";
// import { tsPropertySignature } from "@babel/types";

class App extends React.Component {
  render() {
    return (
      <div>
        <div className="App">
          <Message />
          {/* <Greet /> */}
          {/* <Welcome /> */}
          {/* <Hello name="thi" isName="me" >
            <p>this is children props</p>  
          </Hello>  */}
          {/* <Hello name="memories" isName="mylove">
            <button>Action</button>
          </Hello> */}
          {/* <Hello name="trang" isName="mysister" /> */}
        </div>
      </div>
    );
  }
}

export default App;
