import React, { Component } from 'react';
import TableDataRow from './TableDataRow';

class TableData extends Component {

    // khai bao ham deleteButtonClick(day la 1 ham khac voi ham co ten tuong tu trong TableDataRow)
    deleteButtonClick = (idUser) => {
        // sau khi khai bao ham deleteUser trong App.js,truyen vao <TableData /> ==> TableData se nhan duoc 1 props la deleteUser
        this.props.deleteUser(idUser);
    }
 
    mappingDataUser = () => (
        this.props.dataUserProps.map((value,key) => (<TableDataRow
        deleteButtonClick = {(idUser) => this.deleteButtonClick(idUser)}
        changeEditUserStatus = {() => this.props.changeEditUserStatus()}
        editFunClick={(user) => this.props.editFunc(value)} 
        key={key} 
        stt={key} 
        id={value.id}
        userName={value.name} 
        tel={value.tel} 
        permission={value.Permission} />)
        )
    )
        

    render() {
        return (
            <div className="col">
                <table className="table table-hover">
                    <thead>
                        <tr>
                            <th scope="col">STT</th>
                            <th scope="col">Tên</th>
                            <th scope="col">Số điện thoại</th>
                            <th scope="col">Quyền</th>
                            <th scope="col">Thao tác</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.mappingDataUser()}
                    </tbody>
                </table>
            </div>
        );
    }
}

export default TableData;