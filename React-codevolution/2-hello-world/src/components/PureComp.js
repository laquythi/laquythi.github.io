import React  from "react";

class PureComp extends React.Component{
    render(){
        console.log('3 pure component render');
        return(
            <div>
               Pure Component {this.props.name}
            </div>
        )
    }
}

export default PureComp;