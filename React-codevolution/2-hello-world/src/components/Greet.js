//cach viet 1
// import React from "react";

//cach viet 2
import React , {Component} from "react";

// class Greet extends React.Component{
//     render(){
//         return (
//             <h1>this is content inside greet.js file</h1>
//         )
//     }
// }


//viet cach 1
// const Greet = props => {
//     const {name,heroName} = props;
//     return (
//         <div>
//             {name} full name is {heroName}
//         </div>
//     )
// }

//viet cach 2
const Greet = props => {
    return(
        <div>
            {props.name} full name is {props.heroName}
        </div>
    )
}

// const Greet = () => <h1>content inside Greet.js-with syntax ES6</h1>
export default Greet;
