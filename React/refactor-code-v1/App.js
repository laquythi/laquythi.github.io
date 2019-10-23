import React from "react";
import "./App.css";
import Question from "./components/Question";
import Footer from "./components/Footer";
import Status from "./components/Status";

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
      timeLeft: 5,
      currentQuestionIndex: 0,
      score: 0
    };
  }

  updateCurrentQuestion() {
    if (this.state.currentQuestionIndex < this.state.quiz.length - 1) {
      this.setState(state => ({
        currentQuestionIndex: state.currentQuestionIndex + 1,
        progress: (state.currentQuestionIndex + 1) / state.quiz.length
      }));
    } else {
      this.setState({ timeLeft: 0 });
    }
  }

  componentDidMount() {
    console.log('did mount')
    this.interval = setInterval(
      () => this.updateCurrentQuestion(),
      this.state.timeLeft * 1000
    );
  }

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
        />
        <Footer />
      </div>
    );
  }
}

export default App;
