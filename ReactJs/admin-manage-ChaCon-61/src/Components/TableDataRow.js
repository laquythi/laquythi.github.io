import React, { Component } from 'react';

class TableDataRow extends Component {
    permissionShow = () => {
        if(this.props.permission === 1){
            return 'Admin';
        }else if(this.props.permission === 2){
            return 'Moderator';
        }else {
            return 'Normal';
        }
    }

    editClick = () => {
        this.props.editFunClick();
        this.props.changeEditUserStatus();
    }

    // khai bao function xoa
    deleteButtonClick = (idUser) => {
        // nhan duoc props tu ham co ten tuong tu trong TableData
        this.props.deleteButtonClick(idUser);
    }

    render() {
        return (
            <tr>
                <td>{this.props.stt + 1}</td>
                <td>{this.props.userName}</td>
                <td>{this.props.tel}</td>
                <td>{this.permissionShow()}</td>
                <td>
                    <div className="btn btn-warning mr-2 sua" onClick={() => this.editClick()}><i className="fa fa-edit">Sửa</i></div>
                    <div className="btn btn-danger xoa" onClick={(idUser) => this.deleteButtonClick(this.props.id)}><i className="fas fa-trash-alt"> Xóa</i></div>
                </td>
            </tr>
        );
    }
}

export default TableDataRow;