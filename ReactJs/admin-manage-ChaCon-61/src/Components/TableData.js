import React, { Component } from 'react';
import TableDataRow from './TableDataRow';

class TableData extends Component {

    mappingDataUser = () => (
        this.props.dataUserProps.map((value,key) => (<TableDataRow key={key} stt={key} userName={value.name} tel={value.tel} permission={value.Permission} />)
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