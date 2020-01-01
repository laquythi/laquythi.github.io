import React from 'react';
import './App.css';
// import LoginButton from './Components/LoginButton';
import NameList from "./Components/NameList";

class App extends React.Component{
  render(){
    return(
      <div className="App">
        {/* <LoginButton /> */}
        <NameList />
      </div>
    )
  }
}

export default App;
