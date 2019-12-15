import React from 'react';
import './App.css';
import Todoitem from './components/Todoitem';

class App extends React.Component{
  render(){
    return( 
      <div className="App">
        <Todoitem />
      </div>
    )
  }
}

export default App;
