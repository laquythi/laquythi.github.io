import React from "react";
import BoilingVerdict from "./BoilingVerdict";

class Caculator extends React.Component {
    constructor(props){
        super(props);
        this.handleChange = this.handleChange.bind(this);
        this.state = ({temperature : ''});
    }
    handleChange(e){
        this.setState({temperature : e.target.value})
    }
  render() {
    const temperature = this.state.temperature;
    return (
      <div>
        <legend>Enter temperature in Celsius:</legend>
        <input value={temperature} onChange={this.handleChange} />
        <BoilingVerdict celsius={parseFloat(temperature)} />
      </div>
    );
  }
}

export default Caculator;
