import React from "react";
// import Welcome from "./Components/Welcome";
// import Clock from "./Components/Clock";
// import Toggle from "./Components/Toggle";
// import LoggingButton from "./Components/LoggingButton";
import Greeting from "./Components/Greeting";

class App extends React.Component{
  render(){
    return(
      <div className="App">
        {/* <Welcome name="Autumn Phamm" /> */}
        {/* <Clock /> */}
        {/* <Toggle /> */}
        {/* <LoggingButton /> */}
        <Greeting />
      </div>
    )
  }
}

export default App;