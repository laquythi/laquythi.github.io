import React from "react";

function selectQuestion(answer, answerTrue) {
  if (answer == answerTrue) {
    alert("Chinh xac");
  } else {
    alert("Khong chinh xac");
  }
}

function Question({ quizzes, currentQuestion }) {
  const quiz = quizzes[currentQuestion];

  return (
    <main>
      <div className="Body">
        <div className="Question">{quiz.question}</div>

        <div className="PossibleAnwsers">
          {quiz.answers.map((answer, index) => (
            <div
              className="Anwser"
              key={index}
              onClick={() => {
                selectQuestion(answer, quiz.answerTrue);
              }}
            >
              <div className="AnwserIndex">{index}</div>
              <div className="AnwserContent">{answer}</div>
            </div>
          ))}
        </div>
      </div>

      <div className="Footer">
        <button className="Button ButtonSmall btn btn-secondary">
          Next Question
        </button>
      </div>
    </main>
  );
}

export default Question;
