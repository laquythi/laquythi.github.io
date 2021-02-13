import React, { Component } from 'react';

class EditUser extends Component {

    constructor(props) {
        super(props);
        this.state = {
            id : this.props.userEditObject.id,
            name : this.props.userEditObject.name,
            tel : this.props.userEditObject.tel,
            Permission : this.props.userEditObject.Permission
        }
    }
    

    isChange = (event) => {
        const name = event.target.name;
        const value = event.target.value;
        this.setState({[name] : value});
    }

    saveButton = () => {
        var infor = {};
        infor.id = this.state.id;
        infor.name = this.state.name;
        infor.tel = this.state.tel;
        infor.Permission = this.state.Permission;

        this.props.getUserEditInfor(infor);
        this.props.changeEditUserStatus();
    }

    render() {
        console.log(this.state);
        return (
            <div className="col">
                <form>
                    <div className="text-left">
                        <div className="card border-primary mb-3 mt-2">
                            <div className="card-header">Thêm mới User vào hệ thống</div>
                            <div className="card-body text-primary">
                                <div className="form-group">
                                    <input onChange={(event) => this.isChange(event)} defaultValue={this.props.userEditObject.name} type="text" className="form-control" name="name" placeholder="Tên User" />
                                </div>
                                <div className="form-group">
                                    <input onChange={(event) => this.isChange(event)}  defaultValue={this.props.userEditObject.tel} type="text" className="form-control" name="tel" placeholder="Số điện thoại" />
                                </div>
                                <div className="form-group">
                                    <select className="form-control" onChange={(event) => this.isChange(event)}  defaultValue={this.props.userEditObject.Permission}>
                                        <option>Chọn quyền mặc định</option>
                                        <option value={1}>Admin</option>
                                        <option value={2}>Moderator</option>
                                        <option value={3}>Normal</option>
                                    </select>
                                </div>
                                <div className="form-group">
                                    <input type="button" className="btn btn-block btn-primary"  value="Lưu" onClick={() => this.saveButton()} />
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        );
    }
}

export default EditUser;