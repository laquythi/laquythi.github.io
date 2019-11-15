import React from "react";

class EventBind extends React.Component{
    constructor(props){
        super(props)

        this.state = {
            message : 'hello Thu Bon'
        }
        // c2:
        // this.clickHandler = this.clickHandler.bind(this);
    }
    // c1:
    // clickHandler(){
    //     this.setState({
    //         message: 'Goodbye'
    //     })
    //     console.log(this);
    // }

    //c3
    clickHandler = () => {
        this.setState({
            message : 'Hi Memories PMM'
        })
    }

    render(){
        return(
            <div>
                <div>{this.state.message}</div>
                {/* c1: <button onClick={this.clickHandler.bind(this)}>event bind</button> */}
                {/* c2: <button onClick={() => this.clickHandler()}>event bind</button> */}
                <button onClick={this.clickHandler}>event bind</button>
            </div>
        )
    }
}

export default EventBind;