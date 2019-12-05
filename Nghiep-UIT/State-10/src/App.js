import React from "react";
import "./App.css";
// import Product from "./Components/Product";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      products: [
        {
          id: 1,
          name: "sach 0-1",
          price: 98000,
          image: "",
          status: true
        },
        {
          id: 2,
          name: "sach cha giau cha ngheo",
          price: "56000",
          image: "",
          status: true
        },
        {
          id: 3,
          name: "nhung ke xuat chung",
          price: "89000",
          image: "",
          status: true
        },
        {
          id: 4,
          name: "trong chop mat",
          price: "56000",
          image: "",
          status: true
        },
        {
          id: 5,
          name: "the god father",
          price: "78000",
          image: "",
          status: true
        },
        {
          id: 6,
          name: "sach nguoi giau nhat thanh babylon",
          price: 78000,
          image: "",
          status: true
        }
      ],
      isActive: true
    };
    //c1:
    // this.onSetState = this.onSetState.bind(this);
    //ham onSetState viet nhu binh thuong.
  }
  //c2: chuyen onSetState thanh dang arrow function onSetState = () => {}
  onSetState = () => {
    //c1:
    // if(this.state.isActive === true){
    //   this.setState({
    //     isActive : false
    //   })
    // }else{
    //   this.setState({
    //     isActive : true
    //   })
    // }
    //c2:
    this.setState({
      isActive: !this.state.isActive
    })
  }
  render() {
    let elements = this.state.products.map((anything, index) => {
      let result = "";
      if (anything.status) {
        result = (
          //co the dung key=anything.id
          <tr key={index}>
            <th scope="row">{anything.id}</th>
            <td>{anything.name}</td>
            <td>{anything.price}</td>
          </tr>
        );
      }
      return result;
    });
    return (
      <div className="container">
        <div className="row">
          <table className="table">
            <thead>
              <tr>
                <th scope="col">STT</th>
                <th scope="col">name</th>
                <th scope="col">price</th>
              </tr>
            </thead>
            <tbody>{elements}</tbody>
          </table>
          <button className="btn btn-warning" onClick={this.onSetState}>
            Active : {this.state.isActive === true ? 'true' : 'false'}
          </button>
        </div>
      </div>
    );
  }
}

export default App;
