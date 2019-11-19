import React from "react";
import "./App.css";
import Todoitem from "./components/Todoitem";
import "./components/Todoitem.css";

class App extends React.Component {
  constructor() {
    super();

    this.todoItems = [
      { title: "code all day", isComplete: true },
      { title: "code all night", isComplete: false },
      { title: "code all life" }
    ];
  }
  render() {
    //cach 1:
    // if(this.todoItems.length > 0){
    //   return(
    //     <div className="App">
    //        {
    //          this.todoItems.map((item,index) => <Todoitem key={index} item={item} />)
    //        }
    //     </div>
    //   )
    // }else{
    //   return (
    //     <h1>danh sach san pham trong</h1>
    //   )
    // }
 
    //cach 2:dung toan tu AND
    // return (
    //   <div className="App">
    //     {/* true thì trả về giá trị cuối cùng,nếu có 2 giá trị thì trả về 2. */}
    //     {/* false thì luôn trả về false,bất kể có bao nhiêu giá trị. */}
    //     {this.todoItems.length > 0 && (
    //       <h2>
    //         {this.todoItems.map((item, index) => (
    //           <Todoitem key={index} item={item} />
    //         ))}
    //       </h2>
    //     )}
    //     {this.todoItems.length === 0 && <h2>danh sach san pham trong</h2>}
    //   </div>
    // );

    //cach 3: dung toan tu 3 ngoi.
    return(
      <div className="App">
        {this.todoItems.length > 0 ? this.todoItems.map((item,index) => <Todoitem key={index} item={item} />) : 'danh sach san pham trong'}
      </div>
    )
  }
}

export default App;
