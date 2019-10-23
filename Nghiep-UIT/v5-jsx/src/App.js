import React, { Component } from "react";
import "./App.css";

class App extends Component {
  showInforProdct(product){
    if(product.status){
      return  <h3>ID : {product.ID} <br/>
      name : {product.name} <br/>
      price : {product.price} VNĐ <br/>
      Status : {product.status ? 'Active' : 'Pending'}
   </h3>
    }
  }
  render() {
    var a = 14;
    var b = 17;
    var name = "memories";
    var product = {
      ID: 1,
      name: "nghiepUIT",
      price: 1800000,
      status : true
    };

    var users = [
      {
        id : 1,
        name : "thilaquy",
        age : 28
      },
      {
        id : 2,
        name :"trangla",
        age : 23
      },
      {
        id : 3,
        name :"la quy phong",
        age : 7
      }
    ];

    var elements = users.map((user,index) => {
      return <div key={user.id}>
        <h3>name : {user.name}</h3>
        <p>tuoi : {user.age}</p>
      </div>
    });
    return (
      <div>
        <nav class="navbar navbar-expand-sm bg-light justify-content-center">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link" href="#">
                Link 1
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">
                Link 2
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">
                Link 3
              </a>
            </li>
          </ul>
        </nav>
        <div className="ml-20">
          a : {a}
          <br />b : {b} <br />a + b : {a + b}
          <h2>her name is : {name}</h2>
          {this.showInforProdct(product)}<br/>
          <hr/>
          { elements }
        </div>
      </div>
    );
  }
}

export default App;
