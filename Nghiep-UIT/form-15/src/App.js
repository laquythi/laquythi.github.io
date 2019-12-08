import React from "react";
import "./App.css";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      txtUsername: "",
      txtPassword: "password here",
      txtDesc: "some text here",
      sltGender: 1,
      rdLang: "vi",
      chkbStatus: false
    };
    this.onHandleChange = this.onHandleChange.bind(this);
    this.onHandleSubmit = this.onHandleSubmit.bind(this);
  }
  onHandleChange(event) {
    var target = event.target;
    var name = target.name;
    var value = target.type === "checkbox" ? target.checked : target.value;
    this.setState({
      [name]: value
    });
  }
  onHandleSubmit(event) {
    event.preventDefault();
    console.log(this.state);
  }
  render() {
    return (
      <div className="container mt-30">
        <div className="row">
          <div className="col-xs-8 col-sm-8 col-md-8 col-lg-8">
            <div className="panel panel-primary">
              <div className="panel-heading">
                <div className="panel-title">Form</div>
              </div>
              <div className="panel-body">
                <form onSubmit={this.onHandleSubmit}>
                  <div className="form-group">
                    <label>Username:</label>
                    <input
                      type="text"
                      className="form-control"
                      placeholder=""
                      name="txtUsername"
                      onChange={this.onHandleChange}
                      value={this.state.txtUsername}
                    />
                  </div>
                  <div className="form-group">
                    <label>Password</label>
                    <input
                      type="password"
                      className="form-control"
                      placeholder=""
                      name="txtPassword"
                      onChange={this.onHandleChange}
                    />
                  </div>
                  <div className="form-group">
                    <label>mô tả</label>
                    <textarea
                      className="form-control"
                      name="txtDesc"
                      rows="3"
                      onChange={this.onHandleChange}
                    ></textarea>
                  </div>
                  <label>Giới tính :</label>
                  <select
                    className="form-control"
                    name="sltGender"
                    value={this.state.sltGender}
                    onChange={this.onHandleChange}
                  >
                    <option value={0} selected={this.state === 0}>
                      Nữ
                    </option>
                    <option value={1} selected={this.state === 1}>
                      Nam
                    </option>
                  </select>
                  <br />
                  <label>Ngôn ngữ</label>
                  <div className="radio">
                    <label>
                      <input
                        type="radio"
                        name="rdLang"
                        value="en"
                        onChange={this.onHandleChange}
                        checked={this.state.rdLang === "en"}
                      />
                      tiếng Anh
                    </label>
                    <br />
                    <label>
                      <input
                        type="radio"
                        name="rdLang"
                        value="vi"
                        onChange={this.onHandleChange}
                        checked={this.state.rdLang === "vi"}
                      />
                      tiếng Việt
                    </label>
                  </div>
                  <div className="checkbox" name="chkbStatus" value={true}>
                    <label>
                      <input
                        type="checkbox"
                        onChange={this.onHandleChange}
                        checked={this.state.chkbStatus === true}
                      />
                      trạng thái
                    </label>
                  </div>
                  <br />
                  <button type="submit" className="btn btn-primary">
                    Lưu lại
                  </button>
                  &nbsp;
                  <button type="reset" className="btn btn-danger">
                    Xóa trắng
                  </button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default App;
