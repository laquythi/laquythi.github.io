import React from "react";

class UserGreeting extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: true
    };
  }

  render() {
      //c4: cách này nếu isLoggedIn là true,sẽ return thẻ div,nếu isLoggedIn là false,sẽ ko return(và ko báo lỗi)
    // return this.state.isLoggedIn && <div>hello memories PMM</div>
    //c3:
    //   return(
    //       this.state.isLoggedIn ? 
    //       <div>hello memories PMM</div> : <div>hi Thu Bon</div>
    //   )
    //c1:
       if(this.state.isLoggedIn){
           return(
               <div>hello memories PMM</div>
           )
       }else{
           return(
               <div>hi Thu Bon</div>
           )
       }

    //c2:
    // let message
    // if(this.state.isLoggedIn){
    //     message = <div>hello memories PMM</div>
    // }else{
    //     message = <div>hi Thu Bon</div>
    // }
    // return <div>{message}</div>

    // return (
    //   <div>
    //     <div>hello memories PMM</div>
    //     <div>hi Thu Bon</div>
    //   </div>
    // );
  }
}

export default UserGreeting;
