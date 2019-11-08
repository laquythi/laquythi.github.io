//cach viet 1
import React from "react";
//cach viet 2;
// import React, {Component} from "react";

class Welcome extends React.Component{
    render(){
        return(
            <div>
                <h1>this {this.props.name} is {this.props.isName} </h1>
            </div>
        )
    }
}
export default Welcome;