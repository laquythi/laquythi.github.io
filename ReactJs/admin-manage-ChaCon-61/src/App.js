import React from 'react';
import './App.css';
import Header from './Components/Header';
import SearchForm from './Components/SearchForm';
import TableData from './Components/TableData';
import AddUser from './Components/AddUser';
import DataUser from './Components/Data.json';

const { v4: uuidv4 } = require('uuid');

uuidv4();

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      hienThiForm: false,
      data: DataUser,
      searchText : '',
      editUserStatus : false,
      userEditObject : {}
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

  // tao ham them moi du lieu nguoi dung tu Bo
  getNewUserData = (name,tel,Permission) => {
    var item = {};
    item.id = uuidv4();
    item.name = name;
    item.tel = tel;
    item.Permission = Permission;

    // 1 tao ra 1 bien items chua du lieu trong file .json
    var items = this.state.data;
    // 2 them(day) du lieu tu "item" vao trong bien "items"
    items.push(item);

    // 3 cap nhat lai state,de state luu giu gia tri moi 
    this.setState({
      data : items
    })

    console.log('ket noi App.js va AddUser thanh cong');
    //console.log(this.state.data);
  }

  // tao ham ket noi App.js voi TableData
  editUser = (user) => {
    this.setState({
      userEditObject : user
    });
  }

  // viet ham thay doi trang thai editUserStatus
  changeEditUserStatus = () => {
    this.setState({
      editUserStatus : !this.state.editUserStatus
    });
  }

  getUserEditInforApp = (infor) => {
      this.state.data.forEach((value,key) => {
        if(value.id === infor.id){
            value.name = infor.name;
            value.tel = infor.tel;
            value.Permission = infor.Permission;
        }
      })
  }

  // ham xoa User
  deleteUser = (idUser) => {
    var tempData = this.state.data.filter(item => item.id !== idUser);
    this.setState({
      data:tempData
    });
  }

  render() {
    localStorage.setItem("key1","hehehe");
    console.log(localStorage.getItem("key1"));
    // localStorage.removeItem("key1");
    var ketQua = [];
    this.state.data.forEach((item) => {
      if(item.name.indexOf(this.state.searchText) !== -1 ){
        ketQua.push(item);
      }
    })
    return (
      <div>
        <Header />
        <div className="container">
          <SearchForm
            getUserEditInforApp = {(infor) => this.getUserEditInforApp(infor)}
            userEditObject = {this.state.userEditObject}
            checkConnectProps={(dl) => this.getTextSearch(dl)}
            ketNoi={() => this.doiTrangThai()}
            hienThiForm={this.state.hienThiForm}
            editUserStatus={this.state.editUserStatus}
            changeEditUserStatus = {() => this.changeEditUserStatus()}
            />
          <div className="row">
            {/* dong nay render toan bo du lieu co trong file .json */}
            {/* <TableData dataUserProps={this.state.data} /> */}

            {/* dong nay chi in ra du lieu phu hop trong o input */}
            <TableData 
            deleteUser ={(idUser) => this.deleteUser(idUser)}
            dataUserProps={ketQua} 
            editFunc = {(user) => this.editUser(user)} 
            changeEditUserStatus = {() => this.changeEditUserStatus()}
            />
            <AddUser add={(name,tel,Permission) => this.getNewUserData(name,tel,Permission)} hienThiForm={this.state.hienThiForm} />
          </div>
        </div>
      </div>
    )
  }
}

export default App;
