import React from "react";

class TaskForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      id : "",
      name: "",
      status: true
    };
  }
  componentWillMount(){
    if(this.props.task){
      this.setState({
        id : this.props.task.id,
        name : this.props.task.name,
        status : this.props.task.status
      });
      console.log(this.state);
    }
  }
  onCloseForm = () => {
    this.props.onCloseForm();
  };
  onChange = event => {
    var target = event.target;
    var name = target.name;
    var value = target.value;
    if (name === "status") {
      value = target.value === "true" ? true : false;
    }
    this.setState({
      [name]: value
    });
  };
  onSubmit = event => {
    event.preventDefault();
    this.props.onSubmit(this.state);
    //close form;
    this.onClear();
    this.onCloseForm();
  };
  onClear = () => {
    this.setState({
      name : '',
      status : false
    })
  }

  render() {
    var { id } = this.state;
    return (
      <div className="panel panel-warning">
        <div className="panel-heading">
          <h3 className="panel-title">
            {id !== '' ? 'Cập nhật công việc' : 'Thêm công việc' }
            <span
              className="fa fa-times-circle text-right"
              onClick={this.onCloseForm}
            ></span>
          </h3>
        </div>
        <div className="panel-body">
          <form onSubmit={this.onSubmit}>
            <div className="form-group">
              <label>Tên :</label>
              <input
                type="text"
                className="form-control"
                name="name"
                value={this.state.name}
                onChange={this.onChange}
              />
            </div>
            <label>Trạng Thái :</label>
            <select
              className="form-control"
              required="required"
              value={this.state.status}
              onChange={this.onChange}
            >
              <option value={true}>Kích Hoạt</option>
              <option value={false}>Ẩn</option>
            </select>
            <br />
            <div className="text-center">
              <button type="submit" className="btn btn-warning">
                <span className="fas fa-plus">Lưu lại</span>
              </button>
              &nbsp;
              <button type="submit" className="btn btn-danger" onClick={this.onClear}>
                <span className="fas fa-times">Hủy Bỏ</span>
              </button>
            </div>
          </form>
        </div>
      </div>
    );
  }
}

export default TaskForm;
