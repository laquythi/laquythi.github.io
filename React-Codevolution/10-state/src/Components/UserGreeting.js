// import React from "react";

// class UserGreeting extends React.Component{
//     constructor(props){
//         super(props);
//         this.state = {
//             isLoggedIn : false
//         };
//     }
//     render(){
//         let message;
//         if(this.state.isLoggedIn){
//             message = <div>welcome laquythi</div>
//         }else{
//             message = <div>welcome guest</div>
//         }
//         return message;
//     }
// }

// export default UserGreeting;

import React from "react";

class UserGreeting extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            isLoggedIn : true
        };
    }
    render(){
        return(
            this.state.isLoggedIn ? <div>welcome laquythi</div> : <div>welcome guest</div>
        )
    }
}

export default UserGreeting;