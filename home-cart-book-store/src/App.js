import React from "react";
import "./App.css";
import { BrowserRouter as Router, Route } from "react-router-dom";
import Home from "./Components/Home";
import Cart from "./Components/Cart";

class App extends React.Component {
  render() {
    return (
      <Router>
        <div className="App">
          {/* -----content----- */}
          <Route path="/" exact component={Home} />
          <Route path="/Cart" component={Cart} />
        </div>
      </Router>
    );
  }
}

export default App;
