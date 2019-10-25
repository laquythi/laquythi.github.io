import React from "react";

function Status(props) {
  return (
    <div>
      <h1 id="quiz-name">My Quiz</h1>
      <div className="flex ">
        <div className="progress-bar">
          {props.currentQuestionIndex + 1}/{props.totalQuestion}
        </div>
        <h2 className="timeleft">{props.timeLeft}s </h2>
      </div>
    </div>
  );
}

export default Status;
