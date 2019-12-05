import React from "react";
import "./App.css";
import Product from "./Components/Product";

class App extends React.Component {
  render() {
    var products = [
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
        status: false
      },
      {
        id: 6,
        name: "sach nguoi giau nhat thanh babylon",
        price: 78000,
        image: "",
        status: true
      }
    ];
    let elements = products.map((anything, index) => {
      let result = "";
      if (anything.status) {
        result = (
          <Product
            key={index} //hoac key={anything.id}
            price={anything.price}
            image={anything.image}
          >
            {anything.name}
          </Product>
        );
      }
      return result;
    });
    return (
      <div className="container">
        <div className="row">
          <div className="col-xs-12 col-sm-12 col-md-12 col-lg-12">
            {elements}
          </div>
        </div>
      </div>
    );
  }
}

export default App;
