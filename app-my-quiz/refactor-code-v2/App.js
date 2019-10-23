import React from "react";
import "./App.css";
import Question from "./components/Question";
import Footer from "./components/Footer";
import Status from "./components/Status";

const ANSWER_TIME = 10;

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      quiz: [
        { question: "1+1=?", answers: ["1", "2", "3", "4"], trueAns: "2" },
        {
          question: "Con gì kêu gâu gâu",
          answers: ["Mèo", "Cún", "Dê", "Bò"],
          trueAns: "Cún"
        },
        {
          question: "Mặt trời mọc đằng nào",
          answers: ["Tây", "Nam", "Đông", "Bắc"],
          trueAns: "Đông"
        },
        {
          question:
            "Trong truyện về chú bé nói dối, tại sao sói ăn thịt đàn cừu",
          answers: [
            "Vì dân làng không tin cậu bé",
            "Vì sói đói",
            "Vì thịt cừu ngon",
            "Em không biết"
          ],
          trueAns: "Em không biết"
        }
      ],
      timeLeft: ANSWER_TIME,
      currentQuestionIndex: 0,
      score: 0,
      displayResult: "none"
    };

    this.rightSound = new Audio("../public/right.mp3");
    this.wrongSound = new Audio("../public/fail.mp3");
  }

  updateCurrentQuestion() {
    if (this.state.currentQuestionIndex < this.state.quiz.length - 1) {
      this.setState(state => ({
        currentQuestionIndex: state.currentQuestionIndex + 1
      }));
    } else {
      this.setState({ timeLeft: 0 });
    }

    // TODO: Reset lại đáp án
  }

  ticking() {
    this.interval = setInterval(() => {}, ANSWER_TIME * 1000);

    if (this.state.timeLeft > 0) {
      // đến 0 thì ngưng
      this.setState(state => ({ timeLeft: state.timeLeft - 1 }));
    } else {
      this.setState(state => ({ timeLeft: ANSWER_TIME }));
    }
  }

  onAnswer(answer, trueAns) {
    // Hiển thị đáp án
    this.setState(state => ({ displayResult: "block" }));

    // Kiểm tra đáp án
    if (answer === trueAns) {
      this.setState(state => ({ score: state.score + 1 }));

      // this.rightSound.play();
    } else {
      // this.wrongSound.play();
    }

    // Chuyển câu hỏi sau 2 giây
    // TODO: Trong 2 giây này không cho phép chọn đáp án
    setTimeout(() => {
      this.updateCurrentQuestion();
    }, 2000);
  }

  componentDidMount() {}

  // componentWillMount() {
  //   console.log('will mount')
  //   clearInterval(this.interval);
  // }

  render() {
    return (
      <div id="quiz">
        <Status
          updateCurrentQuestion={this.updateCurrentQuestion}
          timeLeft={this.state.timeLeft}
          totalQuestion={this.state.quiz.length}
          currentQuestionIndex={this.state.currentQuestionIndex}
          progress={this.state.progress}
          score={this.state.score}
        />
        <Question
          quiz={this.state.quiz}
          currentQuestionIndex={this.state.currentQuestionIndex}
          onAnswer={this.onAnswer.bind(this)}
          score={this.state.score}
          displayResult={this.state.displayResult}
        />
        <Footer />
      </div>
    );
  }
}

export default App;
