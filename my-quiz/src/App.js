import React, { useState } from "react";
import "./App.css";

import Status from "./components/Status";
import Question from "./components/Question";

function App() {
  const quizzes = [
    {
      question: "1 + 1 = ?",
      answers: ["1", "2", "3", "4"],
      answerTrue: "2"
    },
    {
      question: "1 + 2 = ?",
      answers: ["1", "2", "3", "4"],
      answerTrue: "3"
    }
  ];
  const currentQuestion = 0;

  return (
    <div className="App container-fluid">
      <div className="Box">
        <Status
          totalQuestion={quizzes.length}
          currentQuestion={currentQuestion}
        />

        <Question quizzes={quizzes} currentQuestion={currentQuestion} />
      </div>
    </div>
  );
}

export default App;
