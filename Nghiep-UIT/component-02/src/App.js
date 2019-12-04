import React from "react";
import "./App.css";
import Header from "./components/Header";
import Products from "./components/Products";

class App extends React.Component {
  showInforProduct(product) {
    if (product.status) {
      return (
        <div>
          <h3>
            id : {product.id} <br />
            name : {product.name} <br />
            price : {product.price} <br />
            producer : {product.producer} <br />
            status : {product.status ? "Active" : ""} <br />
          </h3>
        </div>
      );
    }
  }
  render() {
    var product = {
      id: 1,
      name: "Iphone 5s",
      price: 8500000,
      producer: "Apple",
      status: true
    };
    var users = [
      {
        id : 1,
        name : 'thilaquy',
        age : 28
      }, 
      {
        id : 2,
        name : 'laquyphong',
        age : 7
      }, 
      {
        id : 3,
        name : 'lathitrang',
        age : 23
      }, 
      {
        id : 4,
        name : 'lahonganh',
        age : 12
      }
    ];
    var element = users.map((user,index) => {
      return(
        <div key={user.id}>
          id : {user.id} <br/>
        tên : {user.name} <br/>
        tuổi : {user.age} <br/> <br/>
        </div>
      )
    })
    return (
      <div className="App">
        <Header />
        <Products />
        <div className="product">{this.showInforProduct(product)}</div>
    <div>{element}</div>
      </div>
    );
  }
}

export default App;
