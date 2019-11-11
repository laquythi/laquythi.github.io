import React from "react";
import logo from "./logo.svg";
import "./App.css";
import Greet from "./components/Greet";
import Welcome from "./components/Welcome";
import Hello from "./components/Hello";
import Message from "./components/Message";
import Counter from "./components/Counter";
import FunctionClick from "./components/FunctionClick";
import ClassClick from "./components/ClassClick";
import EventBind from "./components/EventBind";
import ParentComponent from "./components/ParentComponent";

class App extends React.Component {
  render() {
    return (
      <div>
        <div className="App">
          <FunctionClick></FunctionClick>
          <ClassClick />
          <EventBind />
          <ParentComponent />
          {/* <Counter />
          <Greet name="Thi" heroName="laquythi" />
          <Welcome name="React JS" heroName="Javascript language" /> */}
          {/* <Message /> */}
          {/* <Greet />
           <Welcome />
          <Hello name="thi" isName="me" >
            <p>this is children props</p>  
          </Hello> 
          <Hello name="memories" isName="mylove">
            <button>Action</button>
          </Hello>
          <Hello name="trang" isName="mysister" /> */}
        </div>
      </div>
    );
  }
}

export default App;
