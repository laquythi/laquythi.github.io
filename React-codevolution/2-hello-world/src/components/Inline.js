import React from "react";

const heading = {
    fontSize : '40px',
    color : 'green'
};

function Inline(){
    return(
        <div>
            <h2 style={heading}>render content of Inline-style</h2>
        </div>
    )
}

export default Inline;