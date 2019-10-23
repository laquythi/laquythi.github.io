import React from "react";

class Status extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      timeLeft: this.props.timeLeft
    };
  }

  ticking() {
    if (this.state.timeLeft > 0) {
      // đến 0 thì ngưng
      this.setState(state => ({ timeLeft: state.timeLeft - 1 }));
    } else {
      this.setState(state => ({ timeLeft: this.props.timeLeft })); // quay về 5
    }
  }

  componentDidMount() {
    this.interval = setInterval(() => this.ticking(), 1000);
  }
  // componentWillMount() {
  //   clearInterval(this.interval);
  // }
  render() {
    return (
      <div>
        <h1 id="quiz-name">My Quiz</h1>
        <div className="flex ">
          <div className="progress-bar">
            {this.props.currentQuestionIndex + 1}/{this.props.totalQuestion}
          </div>
          <h2 className="timeleft">{this.state.timeLeft}s </h2>
         
        </div>
      </div>
    );
  }
}

export default Status;
