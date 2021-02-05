import React, { Component } from 'react';

class AddUser extends Component {
    kiemTraTrangThai = () => {
        if (this.props.hienThiForm === true) {
            return (
                <div className="col">
                    <div className="text-left">
                        <div className="card border-primary mb-3 mt-2">
                            <div className="card-header">Thêm mới User vào hệ thống</div>
                            <div className="card-body text-primary">
                                <div className="form-group">
                                    <input type="text" className="form-control" name="true" id="true" placeholder="Tên User" />
                                </div>
                                <div className="form-group">
                                    <input type="text" className="form-control" name="true" id="true" placeholder="Số điện thoại" />
                                </div>
                                <div className="form-group">
                                    <select className="form-control" id="exampleFormControlSelect1">
                                        <option>Admin</option>
                                        <option>Moderator</option>
                                        <option>Normal</option>
                                    </select>
                                </div>
                                <div className="form-group">
                                    <input type="text" className="form-control" name="true" id="true" placeholder="Thao tác" />
                                </div>
                                <div className="form-group">
                                    <div className="btn btn-block btn-primary">
                                        Thêm mới
                            </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            )
        }
    }
    render() {
        return (
            <div>
                {this.kiemTraTrangThai()}
            </div>
        )
    }
}

export default AddUser;