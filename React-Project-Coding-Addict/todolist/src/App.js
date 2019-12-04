import React from "react";
import TodoInput from "./components/TodoInput";

class App extends React.Component{
    render(){
        return(
            <div className="App">
                <TodoInput />
            </div>
        )
    }
}

export default App;