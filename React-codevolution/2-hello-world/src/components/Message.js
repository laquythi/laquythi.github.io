// import React from "react";

// class Message extends React.Component{
//     constructor(){
//         super();
//         this.state = {
//             name : "memories",
//             age : 27,
//             add: "QN",
//             message : "I ms you"
//         };
//     }
//     changeMessage(){
//         this.setState({
//             name : "Thu PMM",
//             age : 72,
//             add : "VD",
//             message : "Really"
//         })
//     }
//     render(){
//         return(
//             <div>
//                 <h1>{this.state.name}</h1>
//                 <h2>{this.state.age}</h2>
//                 <h2>{this.state.add}</h2>
//                 <h1>{this.state.message}</h1>
//                 <button onClick={()=>this.changeMessage()}>confirm</button>
//             </div>
//         )
//     }
// }
// export default Message;

import React from "react";

class Message extends React.Component {
  constructor() {
    super();
    this.state = {
      name: "Memories PMM",
      age: 27,
      address: "QN",
      message: "good luck"
    };
  }
  changeMessage(){
      this.setState({
        name: "Autumn",
        age: 72,
        address: "vd",
        message: "^^"
      })
  }
  render() {
    return (
      <div>
        <h1>{this.state.name}</h1>
        <h1>{this.state.age}</h1>
        <h1>{this.state.address}</h1>
        <h1>{this.state.message}</h1>
        <button onClick={()=>{this.changeMessage()}}>confirm</button>
      </div>
    );
  }
}
export default Message;
