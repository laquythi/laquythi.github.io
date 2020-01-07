import React from 'react';
import Example from "./Components/Example";
import HookCounter from "./Components/HookCounter";

class App extends React.Component {
  render() {
    return(
      <div>
        <HookCounter />
        {/* <Example /> */}
        {/* <ClassCounter /> */}
      </div>
    );
  }
}


export default App;
