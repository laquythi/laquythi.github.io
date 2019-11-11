//cach viet 1
import React from "react";
//cach viet 2;
// import React, {Component} from "react";

class Welcome extends React.Component{
    render(){
        const {name,heroName} = this.props;
        return(
            <div>
                <h1>{name} is {heroName} </h1>
            </div>
        )
    }
}
export default Welcome;