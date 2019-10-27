import React from "react";

function Status(props){
  const progress = (props.currentQuestion / props.totalQuestion) * 100;
  return (
    <div className="status_Area">
      <div className="meter">
        <span style={{width:progress + '%'}} />
      </div>
      <div className="time">
        {props.time}
      </div>
    </div>
  )
}

export default Status;