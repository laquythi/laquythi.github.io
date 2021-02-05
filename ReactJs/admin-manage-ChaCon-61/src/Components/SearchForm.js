import React, { Component } from 'react';

class SearchForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            tempValue : ""
        }
    }
    
    isChange = (event) => {
        console.log(event.target.value);
        this.setState({
            tempValue:event.target.value
        })
        this.props.checkConnectProps(this.state.tempValue)
    }
    hienThiButton = () => {
        if(this.props.hienThiForm === true){
            return <div className="btn btn-block btn-outline-info" onClick={() => {this.props.ketNoi()}} >Đóng lại</div>
        }else{
            return <div className="btn btn-block btn-outline-info" onClick={() => {this.props.ketNoi()}} >Thêm mới User</div>
        }
    }
    
    render() {
        return (
            <div className="row">
                <div className="col-12">
                    <div className="form-group">
                        <div className="btn-group">
                            <input type="text" onChange={(event) => this.isChange(event)} className="form-control" name="true" id="true" placeholder="nhập tên cần tìm" />
                            <div className="btn btn-info" onClick={(dl) => this.props.checkConnectProps(this.state.tempValue) }>Tìm</div>
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