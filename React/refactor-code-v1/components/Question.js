import React from "react";

class Question extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      displayResult: "none",
      score: 0
    };
    this.rightSound = new Audio("../public/right.mp3");
    this.wrongSound = new Audio("../public/fail.mp3");
  }

  onAnswer(answer, trueAns) {
    this.setState(state => ({ displayResult: "block" }));
    if (answer === trueAns) {
      this.setState(state => ({ score: state.score + 1 }));
      this.wrongSound.play();
    } else {
      this.wrongSound.play();
    }
  }

  render() {
    const currentQuestion = this.props.quiz[this.props.currentQuestionIndex];

    return (
      <div>
        <div id="question">
          <h2>{currentQuestion.question}</h2>

          {currentQuestion.answers.map((answer, index) => (
            <span key={index}>
              <input
                id={index}
                type="radio"
                name="choices"
                defaultValue="choices-0"
                onChange={this.onAnswer.bind(
                  this,
                  answer,
                  currentQuestion.trueAns
                )}
              />

              <label htmlFor={index}>{answer}</label>
            </span>
          ))}
        </div>
        {/* <button id="submit-button" disabled>
      Submit Answers
    </button> */}

        <div id="quiz-results">
          <p
            id="quiz-results-message"
            style={{ display: this.state.displayResult }}
          >
            Đáp án đúng:
            {currentQuestion.trueAns}
          </p>
          <p id="quiz-results-message">
            Score:
            {this.state.score}
          </p>
        </div>
      </div>
    );
  }
}

export default Question;
