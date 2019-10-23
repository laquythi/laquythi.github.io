import React from "react";

function Status(props) {
  const progress = (props.currentQuestion / props.totalQuestion) * 100;

  return (
    <div className="Header">
      <div className="LeftSide">
        <div className="ProgressBar" style={{ width: (progress * 350) / 100 }}>
          <span className="Percent">{progress}%</span>
        </div>
      </div>
      <div className="RightSide">
        <div className="CurrentQuestion">{props.currentQuestion}</div>
      </div>
    </div>
  );
}

export default Status;
