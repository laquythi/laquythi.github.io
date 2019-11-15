import React from "react";

class Form extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      username: "",
      comment: "",
      topic: "react" //default
    };
  }
  handlerUsernameChange = event => {
    this.setState({
      username: event.target.value
    });
  };
  handlerCommentsChange = event => {
    this.setState({
      comment: event.target.value
    });
  };
  handlerTopicChange = event => {
    this.setState({
      topic: event.target.value
    });
  };
  handlerSubmit = event => {
      alert(`${this.state.username} ${this.state.comment} ${this.state.topic}`);
    //   event.preventDefault();
  }

  render() {
      const {username,comments,topic} = this.state;
    return (
      <form onSubmit={this.handlerSubmit}>
        <div>
          <label>User Name</label>
          <input
            type="text"
            value={username}
            onChange={this.handlerUsernameChange}
          ></input>
        </div>
        <div>
          <label>Comment</label>
          <textarea
            value={comments}
            onChange={this.handlerCommentsChange}
          ></textarea>
        </div>
        <div>
          <label>Topic</label>
          <select value={topic} onChange={this.handlerTopicChange}>
            <option value="react">React</option>
            <option value="angular">Angular</option>
            <option value="vuejs">Vue</option>
          </select>
        </div>
        <div>
          <button type="submit">Submit</button>
        </div>
      </form>
    );
  }
}

export default Form;
