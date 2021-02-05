import React, { Component } from 'react';

class Header extends Component {
    render() {
        return (
            <div className="jumbotron jumbotron-fluid">
                <div className="container text-center">
                    <h6 className="display-3">Project quản lý thành viên bằng ReactJS</h6>
                    <p className="lead">Với dữ liệu Json</p>
                </div>
            </div>
        );
    }
}

export default Header;