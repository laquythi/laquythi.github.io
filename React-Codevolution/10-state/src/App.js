import React from "react";
// import Message from "./Components/Message";
import Counter from "./Components/Counter";
import ClassClick from "./Components/ClassClick";
import EventBind from "./Components/EventBind";
import UserGreeting from "./Components/UserGreeting";

class App extends React.Component{
  render(){
    return(
      <div className="text-center">
        {/* <Message /> */}
        {/* <Counter name="Thi La Quy" address="Thai Binh" /> */}
        {/* <ClassClick /> */}
        {/* <EventBind /> */}
        <UserGreeting />
      </div>
    )
  }
}

export default App;