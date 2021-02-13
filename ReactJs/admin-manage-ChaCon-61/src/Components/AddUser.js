import React, { Component } from 'react';

class AddUser extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: "",
            name: "",
            tel: "",
            Permission: ""
        }
    }

    isChange = (event) => {
        const name = event.target.name;
        const value = event.target.value;

        this.setState({
            [name]: value
        })

        // package to item
        // var item = {};
        // item.id = this.state.id;
        // item.name = this.state.name;
        // item.tel = this.state.tel;
        // item.Permission = this.state.Permission;
    }
    kiemTraTrangThai = () => {
        if (this.props.hienThiForm === true) {
            return (
                <div className="col">
                    <form>
                        <div className="text-left">
                            <div className="card border-primary mb-3 mt-2">
                                <div className="card-header">Thêm mới User vào hệ thống</div>
                                <div className="card-body text-primary">
                                    <div className="form-group">
                                        <input type="text" onChange={(event) => this.isChange(event)} className="form-control" name="name" placeholder="Tên User" />
                                    </div>
                                    <div className="form-group">
                                        <input type="text" onChange={(event) => this.isChange(event)} className="form-control" name="tel" placeholder="Số điện thoại" />
                                    </div>
                                    <div className="form-group">
                                        <select className="form-control" onChange={(event) => this.isChange(event)} name="Permission" >
                                            <option>Admin</option>
                                            <option>Moderator</option>
                                            <option>Normal</option>
                                        </select>
                                    </div>
                                    <div className="form-group">
                                        <input type="reset" className="btn btn-block btn-primary" onClick={(name, tel, Permission) => this.props.add(this.state.name, this.state.tel, this.state.Permission)}
                                          value=" Thêm mới"
                                        />
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
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