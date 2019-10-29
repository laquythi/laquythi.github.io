import React from "react";
import "./App.css";

import Question from "./components/Question";
import Status from "./components/Status";
import Result from "./components/Result";
import Starting from "./components/Starting";
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";

//Use class ES6 để định nghĩa component
class App extends React.Component {
  //Khai báo giá trị, nơi duy nhất để gán giá trị cho state là hàm tạo constructor
  constructor(props) {
    super(props);
    this.state = {
      quizzes: [
        {
          question: "Câu 1 : 5 x 2  = ?",
          answers: ["5", "12", "30", "10"],
          answerTrue: "10"
        },
        {
          question: "Câu 2: thành phố Hạ Long thuộc tỉnh nào ? ",
          answers: ["Hải Dương", "Thái Bình", "Quảng Ninh", "Bình Dương"],
          answerTrue: "Quảng Ninh"
        },
        {
          question: "Câu 3: Anh Huy có đẹp trai không?",
          answers: ["Đẹp trai", "Không đẹp trai", "Xấu trai", "Xinh trai"],
          answerTrue: "Xinh Trai"
        },
        {
          question: "Câu 4: Hồ Hoàn Kiếm thuộc quận nào của Hà Nội",
          answers: ["Đống Đa", "2 Bà Trưng", "Hoàn Kiếm", "3 Đình"],
          answerTrue: "Hoàn Kiếm"
        }
      ],
      currentQuestion: 1,
      thinkingTime: 5,
      scoreQuiz: 0,
      isDone: false
    };
  }
  //Hàm next question
  onAnswer(answer, answerTrue) {
    console.log(answer, answerTrue);
    if (answer===answerTrue) {
      this.setState({
        scoreQuiz: this.state.scoreQuiz+1
      });
    };
    if(this.state.currentQuestion < this.state.quizzes.length){
      this.setState({
        currentQuestion: this.state.currentQuestion + 1,
        thinkingTime: 5,
      });
    } 
    else {
      console.log("Số điểm của bạn là: "+ this.state.scoreQuiz);
      //Dừng hàm đếm thời gian
      clearInterval(this.myInterval)
      this.setState({
        isDone: true
      });
    }
  }
  //Hàm đếm thời gian sử dụng Interval
  componentDidMount() {
    this.myInterval = setInterval(() => {
      const thinkingTime = this.state.thinkingTime;
      if (thinkingTime > 0) {
        this.setState(({ thinkingTime }) => ({
          thinkingTime: thinkingTime - 1
        }));
      }
      else if (this.state.currentQuestion < this.state.quizzes.length){
        this.setState({
          currentQuestion: this.state.currentQuestion + 1,
          thinkingTime: 5
        });
      }
      else{
        console.log("Số điểm của bạn là: "+ this.state.scoreQuiz);
        //Dừng hàm đếm thời gian
        clearInterval(this.myInterval)
        this.setState({
          isDone: true
        });
      }
    }, 1000);
  }
  render() {
    // const {quizzes, currentQuestion, } = this.state
    // return (
    //   <div className="App">
    //     <div className="box">
    //       {this.state.isDone===false && <Status
    //         totalQuestion={this.state.quizzes.length}
    //         currentQuestion={this.state.currentQuestion}
    //         timer={this.state.thinkingTime}
    //         isDone={this.state.isDone}
    //       />}
    //       {this.state.isDone===false &&<Question
    //         quizzes={this.state.quizzes}
    //         currentQuestion={this.state.currentQuestion}
    //         onAnswer={this.onAnswer.bind(this)}
    //         isDone={this.state.isDone}
    //       />}
    //       {this.state.isDone===true && <Result 
    //         totalQuestion={this.state.quizzes.length}
    //         scoreQuiz={this.state.scoreQuiz}
    //         isDone={this.state.isDone}
    //       />}
    //     </div>
        
    //   </div>
    // );

    return (
      <main className="grey">
        <Switch>
          <Route path="/" exact>
            <Starting />
          </Route>
          <Route path="/quiz" ></Route>
        </Switch>
      </main>
    )
  }
}

export default App;