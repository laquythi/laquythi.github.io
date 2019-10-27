import React, { Component } from "react";
import "./App.css";

class App extends Component {
  ShowInforProduct(product){
    if(product.status){
      return <h2>
      ID : {product.id} <br />
      Name : {product.name} <br />
      Price : {product.price} VNĐ <br />
      Status : {product.status ? 'Active' : 'Pending'}
    </h2>
    }
  }
  render() {
    var a = 5;
    var name = "bolshevik";
    var b = 10;
    var product = {
      id: "1",
      name: "Iphone X",
      price: 13400000,
      status : true
    };
    var users = [
      {
        id : 1,
        name : 'laquythi',
        age : 28
      },
      {
        id : 2,
        name : 'lathitrang',
        age : 23
      },
      {
        id : 3,
        name : 'lahonganh',
        age : 12
      }
    ];
    var elements = users.map((user,index) => {
      return <div key={user.id}>
        <h2>Tên : {user.name} </h2>
        <p>Tuổi : {user.age}  </p>
      </div>
    })

    return (
      <div>
        <nav className="navbar bg-light">
          <ul className="navbar-nav">
            <li className="nav-item">
              <a className="nav-link" href="#">
                Home
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="#">
                Link 2
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="#">
                Link 3
              </a>
            </li>
          </ul>
        </nav>
        <div className="ml-30">
          <h2>
            a : {a} <br />
            b : {b} <br />
            a + b : {a + b} <br />
          </h2>
          <h3>
            name : {name}
          </h3>
          {this.ShowInforProduct(product)} <br/ >
          <hr />
          {elements}
        </div>
      </div>
    );
  }
}

export default App;
