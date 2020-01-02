import React from "react";

function BoilingVerdict(props){
    if(props.celsius >= 100){
        return <p>the water would boil.</p>;
    }else{
        return <p>the water would not boil.</p>;
    }
}

export default BoilingVerdict;