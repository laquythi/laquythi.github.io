import React from "react";

function Question(props) {
  const currentQuestion = props.quiz[props.currentQuestionIndex];

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
              onChange={props.onAnswer.bind(
                null,
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
          style={{ display: props.displayResult }}
        >
          Đáp án đúng:
          {currentQuestion.trueAns}
        </p>
        <p id="quiz-results-message">
          Score:
          {props.score}
        </p>
      </div>
    </div>
  );
}

export default Question;
