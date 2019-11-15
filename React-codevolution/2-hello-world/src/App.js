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
import UserGreeting from "./components/UserGreeting";
import NameList from "./components/NameList";
import Person from "./components/Person";
import Stylesheet from "./components/Stylesheets";
import Inline from "./components/Inline";
import Form from "./components/Form";
import appStyle from "./appStyle.css";
import "./appStyle.css";
import style from "./appStyles.module.css";
import LifecycleA from "./components/LifecycleA";
import LifecycleB from "./components/LifecycleB";
import FragmentDemo from "./components/FragmentDemo";
import Table from "./components/Table";
import ParentComp from "./components/ParentComp";
import RefsDemo from "./components/RefsDemo";
import FocusInput from "./components/FocusInput";

class App extends React.Component {
  render() {
    return (
      <div>
        <div className="App">
          <FocusInput />
          {/* <RefsDemo /> */}
          {/* <ParentComp /> */}
          {/* <Table /> */}
          {/* <FragmentDemo /> */}
          {/* <LifecycleA /> */}
          {/* <Form /> */}
          {/* <h1 className='error'>Error</h1>
          <h2 className={style.success}>Success</h2> */}
          {/* <NameList /> */}
          {/* <Stylesheet primary={true} />
          <Inline /> */}
          {/* <FunctionClick></FunctionClick> */}
          {/* <ClassClick /> */}
          {/* <EventBind /> */}
          {/* <UserGreeting /> */}
          {/* <ParentComponent /> */}
          {/* <ParentComponent /> */}
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
