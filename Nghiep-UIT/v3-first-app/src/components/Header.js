import React ,{Component} from 'react';

function Header() {
  return (
    <div className="container">
        <div className="row">
            <div className="col-xs-3 col-sm-3 col-md-3 col-lg-3">
              <div classNam="thumbnail">
                <div className="caption">
                  <h3>MP</h3>
                  <p>TL-HN</p>
                  <p>
                    <a className="btn btn-primary">MPm</a>
                    <a className="btn btn-primary">React Developer</a>
                  </p>
                </div>
              </div>
            </div>
        </div>
    </div>
  );
}

//cach khai bao 2
// class Header extends Component{
//     render(){
//         return (
//             <div>
//                 <h1>header</h1>
//             </div>
//         );
//     }
// }

export default Header;
