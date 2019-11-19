import React from "react";
import './Todoitem.css';

class Todoitem extends React.Component{
    onItemClick(){
        console.log(this.props.item );
    }
    render(){
        const {item} = this.props;
        return(
            <div onClick={() => this.onItemClick()} className={className('Todoitem',{
                'Todoitem-complete':item.isComplete
            })}>
    <p>{this.props.item.title}</p>
            </div>
        )
    }
}

export default Todoitem;