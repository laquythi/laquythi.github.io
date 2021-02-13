import React, { Component } from 'react';
import EditUser from './EditUser';

class SearchForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            tempValue: "",
            userObj : {}
        }
    }

    getUserEditInfor = (infor) => {
        this.setState({
            userObj : infor
        });
        this.props.getUserEditInforApp(infor);
    }

    isChange = (event) => {
        console.log(event.target.value);
        this.setState({
            tempValue: event.target.value
        })
        this.props.checkConnectProps(this.state.tempValue)
    }
    hienThiButton = () => {
        if (this.props.hienThiForm === true) {
            return <div className="btn btn-block btn-outline-info" onClick={() => { this.props.ketNoi() }} >Đóng lại</div>
        } else {
            return <div className="btn btn-block btn-outline-info" onClick={() => { this.props.ketNoi() }} >Thêm mới User</div>
        }
    }

    // ham kiem tra trang thai editUserStatus
    isShowEditForm = () => {
        if(this.props.editUserStatus === true){
            return <EditUser
            getUserEditInfor = {(infor) => this.getUserEditInfor(infor)}
            userEditObject={this.props.userEditObject}
            changeEditUserStatus = {() => this.props.changeEditUserStatus()} />
        }
    }

    render() {
        return (
            <div className="row">
                
                {/* form sua thong tin User */}
                {this.isShowEditForm()}

                {/* form tim kiem User trong he thong */}
                <div className="col-12">
                    <div className="form-group">
                        <div className="btn-group">
                            <input type="text" onChange={(event) => this.isChange(event)} className="form-control" name="true" id="true" placeholder="nhập tên cần tìm" />
                            <div className="btn btn-info" onClick={(dl) => this.props.checkConnectProps(this.state.tempValue)}>Tìm</div>
                        </div>
                    </div>
                    <div className="btn-group">
                        {this.hienThiButton()}
                    </div>
                </div>
                <div className="col-12">
                    <hr />
                </div>
            </div>
        );
    }
}

export default SearchForm;