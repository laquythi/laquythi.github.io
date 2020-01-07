import React from "react";

class ClassClick extends React.Component {

    clickHandle(){
        console.log('clicked the button');
    }
    render() {
        return (
            <div>
                <button onClick={this.clickHandle}>Click Me</button>
            </div>
        );
    }
}

export default ClassClick;