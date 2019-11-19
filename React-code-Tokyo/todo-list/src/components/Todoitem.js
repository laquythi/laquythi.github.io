import React from "react";
import './Todoitem.css';

class Todoitem extends React.Component{
    render(){
        const { item } = this.props; // cach 2 : const item = this.props.item
        let className = 'TodoItem';
        if(item.isComplete){
            // className += ' TodoItem-complete';
            className = className + ' TodoItem-complete';
        }
        return(
            <div className={className}>
                <p>{this.props.item.title}</p>
            </div>
        )
    }
}

export default Todoitem;