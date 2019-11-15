import React from "react";
import "./myStyle.css";

function Stylesheet(props){
    let conditional = props.primary ? 'primary' : ' ' 
    return(
        <div>
            <h1 className={` ${conditional} font-xl `}>stylesheet</h1>
        </div>
    )
}

export default Stylesheet;