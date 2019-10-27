import React, { Component } from "react";
import "./App.css";
import Product from "./components/Product";

class App extends Component {
  render() {
    var products = [
      {
        id: 1,
        name: "Iphone X 128G",
        price: 14500000,
        image:
          "https://sudospaces.com/thanhtrungmobile-vn/2017/11/thay-mic-iphone-x-1.jpg",
        status: true
      },
      {
        id: 2,
        name: "Iphone 8 Plus 128G",
        price: 10400000,
        image:
          "https://cdn.tgdd.vn/Products/Images/42/114113/iphone-8-64gb-hh-600x600.jpg",
        status: true
      },
      {
        id: 3,
        name: "Iphone 7 16G",
        price: 9500000,
        image:
          "https://ss7.vzw.com/is/image/VerizonWireless/iphone7-front-matblk?$png8alpha256$&hei=520",
        status: true
      }
    ];
    let elements = products.map((product, index) => {
      let result = "";
      if (product.status) {
        result = (
          <Product key={product.id} price={product.price} image={product.image}>
            {product.name}
          </Product>
        );
      }
      return result;
    });

    return (
      <div>
        <nav class="navbar navbar-light bg-light">
          <a class="navbar-brand" href="#">
            Props
          </a>
        </nav>

        <div className="container">
          <div className="row">
            <div className="col-xs-12 col-sm-12 col-md-12 col-lg-12">
              {elements}
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default App;
