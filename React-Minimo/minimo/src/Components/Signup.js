import React from "react";
import "./signup.css";

class Signup extends React.Component {
  render() {
    return (
      <div className="sign-up container-fluid">
        <div className="text-center">
          <p>Sign up for our newsletter!</p> <br />
          <div className="input">
            <input type="text" placeholder="Enter a valid email address" />
            <a href="true" className="send">
              <i className="far fa-paper-plane" />
            </a>
          </div>
        </div>
      </div>
    );
  }
}

export default Signup;
