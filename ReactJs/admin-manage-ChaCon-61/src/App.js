import React from 'react';
import './App.css';
import Header from './Components/Header';
import SearchForm from './Components/SearchForm';
import TableData from './Components/TableData';
import AddUser from './Components/AddUser';
import DataUser from './Components/Data.json';

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      hienThiForm: false,
      data: DataUser,
      searchText : ''
    }
  }

  doiTrangThai = () => {
    this.setState({
      hienThiForm: !this.state.hienThiForm
    })
  }

  // kiem tra ket noi tu App.js voi SearchForm.js
  getTextSearch = (dl) => {
    this.setState({
      searchText : dl
    })
  }

  render() {
    var ketQua = [];
    this.state.data.forEach((item) => {
      if(item.name.indexOf(this.state.searchText) !== -1 ){
        ketQua.push(item);
      }
    })
    console.log(ketQua);
    return (
      <div>
        <Header />
        <div className="container">
          <SearchForm
            checkConnectProps={(dl) => this.getTextSearch(dl)}
            ketNoi={() => this.doiTrangThai()}
            hienThiForm={this.state.hienThiForm} />
          <div className="row">
            {/* dong nay render toan bo du lieu co trong file .json */}
            {/* <TableData dataUserProps={this.state.data} /> */}

            {/* dong nay chi in ra du lieu phu hop trong o input */}
            <TableData dataUserProps={ketQua} />
            <AddUser hienThiForm={this.state.hienThiForm} />
          </div>
        </div>
      </div>
    )
  }
}

export default App;
