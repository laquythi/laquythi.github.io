import React from "react";

class Product extends React.Component {
//  constructor(props){
//    super(props);
//    this.onAddToCart = this.onAddToCart.bind(this);
//  }
//  onAddToCart(){
//    alert(this.props.children + ' ' + this.props.price + ' vnd');
//  }
  onAddToCart2 = () => {
    alert(this.props.children + ' ' + this.props.price + ' vnd');
  }
  render() {
    return (
      <div className="container">
        <div className="row">
          <div className="col-sm-12 col-md-12 col-lg-12">
            <div className="thubmnail">
              <img alt={this.props.children} src={this.props.image} />
              <div className="caption">
                <h3>{this.props.children}</h3>
                <p>{this.props.price} VNĐ</p>
                <a className="btn btn-primary" onClick={this.onAddToCart2}>Mua Ngay</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Product;
