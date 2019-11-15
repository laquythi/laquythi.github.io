import React from "react";

function Person({person}){
  return(
    <div>
      <h2>
        I'm {person.name},My skill is {person.skill}
      </h2>
    </div>
  )
}

export default Person;