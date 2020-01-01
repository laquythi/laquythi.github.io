// import React from "react";

// class LogginButton extends React.Component {
//   constructor(props) {
//     super(props);
//     this.state = {
//       isLoggin: true
//     };
//   }
//   render() {
//     let message;
//     if (this.state.isLoggin) {
//       message = <div>welcome to my SPA</div>;
//     } else {
//       message = <div>loggin please</div>;
//     }
//     return <div>{message}</div>;
//   }
// }

// export default LogginButton;


// import React from "react";

// class LogginButton extends React.Component{
//     constructor(props){
//         super(props);
//         this.state = {
//             isLoggin : true
//         };
//     }
//     render(){
//         if(this.state.isLoggin){
//             return(
//                 <div>welcome to my SPA</div>
//             )
//         }else{
//             return(
//                 <div>loggin please</div>
//             )
//         }
//     }
// }

// export default LogginButton;

import React from "react";

class LogginButton extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            isLoggin : true
        };
    }
    render(){
        return(
            this.state.isLoggin ? <div>welcome to my SPA</div> : <div>loggin please !</div> 
        )
    }
}

export default LogginButton;