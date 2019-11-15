import React  from "react";


class RegComp extends React.Component{
    render(){
        console.log('2 reg component render');
        return(
            <div>
                <h1>Regular Component {this.props.name} </h1>
            </div>
        )
    }
}

export default RegComp;