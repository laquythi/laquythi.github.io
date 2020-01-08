import React from "react";
import NameList from "./Components/NameList";

class App extends React.Component{
  render(){
    return(
      <div className="text-center">
        {/* <Message /> */}
        {/* <Counter name="Thi La Quy" address="Thai Binh" /> */}
        {/* <ClassClick /> */}
        {/* <EventBind /> */}
        {/* <UserGreeting /> */}
        <NameList />
      </div>
    )
  }
}

export default App;