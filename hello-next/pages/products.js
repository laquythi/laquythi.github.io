import MainLayout from "../components/main-layout";

const Products = () => (
  <div>
    <MainLayout>
      <div>
        <div className="row vanHoc">
          <div className="col-lg-3 col-md-4 col-sm-6 sp">
            <a href="detail-product.html">
              <img
                src="images/products/trai-suc-vat.png"
                title="trai suc vat"
              
              />
            </a>
            <p>Số trang : 320</p>
            <p>Tái Bản : 2014</p>
            <p className="price">Giá : 90.000</p>
            <div className="icon">
              <p className="star">
                <i className="fas fa-star" />
                <i className="fas fa-star" />
                <i className="fas fa-star" />
                <i className="fas fa-star" />
                <i className="fas fa-star" />
              </p>
              <a className="cart" href="pay.html">
                <i className="fas fa-cart-plus" />
              </a>
            </div>
          </div>
          <div className="col-lg-3 col-md-4 col-sm-6 sp">
            <a href="detail-product.html">
              <img src="images/products/bi-vo.png" title="bỉ vỏ" alt />
            </a>
            <p>Số trang : 400</p>
            <p>Tái Bản : 2015</p>
            <p className="price">
              Giá : 79.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
            <div className="icon">
              <p className="star">
                <i className="fas fa-star" />
                <i className="fas fa-star" />
                <i className="fas fa-star" />
              </p>
              <a className="cart" href="pay.html">
                <i className="fas fa-cart-plus" />
              </a>
            </div>
          </div>
          <div className="col-lg-3 col-md-4 col-sm-6 sp">
            <a href="detail-product.html">
              <img
                src="images/products/song-o-day-song.png"
                title="sóng ở đáy sông"
                alt
              />
            </a>
            <p>Số trang : 500</p>
            <p>Tái Bản : 2010</p>
            <p className="price">
              Giá : 50.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
            <div className="icon">
              <p className="star">
                <i className="fas fa-star" />
                <i className="fas fa-star" />
                <i className="fas fa-star" />
                <i className="fas fa-star" />
                <i className="fas fa-star" />
              </p>
              <a className="cart" href="pay.html">
                <i className="fas fa-cart-plus" />
              </a>
            </div>
          </div>
          <div className="col-lg-3 col-md-4 col-sm-6  sp">
            <a href="detail-product.html">
              <img
                src="images/products/an-may-di-vang.png"
                title="ăn mày dĩ vãng"
                alt
              />
            </a>
            <p>Số trang : 230</p>
            <p>Tái Bản : 2011</p>
            <p className="price">
              Giá : 65.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
            <div className="icon">
              <p className="star">
                <i className="fas fa-star" />
                <i className="fas fa-star" />
                <i className="fas fa-star" />
              </p>
              <a className="cart" href="pay.html">
                <i className="fas fa-cart-plus" />
              </a>
            </div>
          </div>
          <div className="col-lg-3 col-md-4 col-sm-6 sp">
            <a href="detail-product.html">
              <img
                src="images/products/di-ngang-ha-noi.png"
                title="đi ngang hà nội"
                alt
              />
            </a>
            <p>Số trang : 190</p>
            <p>Tái Bản : 2010</p>
            <p className="price">
              Giá : 120.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
            <div className="icon">
              <p className="star">
                <i className="fas fa-star" />
                <i className="fas fa-star" />
                <i className="fas fa-star" />
                <i className="fas fa-star" />
              </p>
              <a className="cart" href="pay.html">
                <i className="fas fa-cart-plus" />
              </a>
            </div>
          </div>
          <div className="col-lg-3 col-md-4 col-sm-6 sp">
            <a href="detail-product.html">
              <img
                src="images/products/hary-poster.png"
                title="hary poster"
                alt
              />
            </a>
            <p>Số trang : 1200</p>
            <p>Tái Bản : 2019</p>
            <p className="price">
              Giá : 230.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
            <div className="icon">
              <p className="star">
                <i className="fas fa-star" />
                <i className="fas fa-star" />
                <i className="fas fa-star" />
              </p>
              <a className="cart" href="pay.html">
                <i className="fas fa-cart-plus" />
              </a>
            </div>
          </div>
          <div className="col-lg-3 col-md-4 col-sm-6 sp">
            <a href="detail-product.html">
              <img
                src="images/products/catching-fire.png"
                title="catching fire"
                alt
              />
            </a>
            <p>Số trang : 310</p>
            <p>Tái Bản : 2013</p>
            <p className="price">
              Giá : 140.000{" "}
              <span style={{ textDecoration: "underline" }}>đ</span>
            </p>
            <div className="icon">
              <p className="star">
                <i className="fas fa-star" />
                <i className="fas fa-star" />
                <i className="fas fa-star" />
              </p>
              <a className="cart" href="pay.html">
                <i className="fas fa-cart-plus" />
              </a>
            </div>
          </div>
        </div>
      </div>
    </MainLayout>
  </div>
);

export default Products;

//3: trong components menu có 2 thẻ link,link đến HomePage và About
