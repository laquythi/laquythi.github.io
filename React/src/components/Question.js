import React from "react";

function Question({ quizzes, currentQuestion, onAnswer }) {
  const quiz = quizzes[currentQuestion - 1];
  return (
    <div className="main_Area">
      <div className="question">{quiz.question}</div>
      <div className="list_Answer"> 
        {quiz.answers.map((answer, index) => (
          <div
            className="answer"
            key={index}
            onClick={() => onAnswer(answer, quiz.answerTrue)}
          >
            <div className="answer_Index">{index + 1}</div>
            <div className="answer_Content">{answer}</div>
          </div>
        ))}
      </div>
    </div>
  );
}

export default Question;