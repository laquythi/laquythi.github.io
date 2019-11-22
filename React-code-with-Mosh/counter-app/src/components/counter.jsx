import React from "react";

class Counter extends React.Component{ 
    render(){
        
        return(
           <div>
    <span className={this.getBadgetClasses()}>{this.formatCount()}</span>
               <button onClick={()=> this.props.onIncrement(this.props.counter)}></button>
                <button onClick={() => this.props.onIncrement(this.props.counter)} className="btn btn-primary m-2">Increment</button>
                <button onClick={() => this.props.onDelete(this.props.counter.id)} className="btn btn-danger m-2">Delete</button>
           </div>
        )
    }
    getBadgetClasses(){
        let classes = 'badge m-2 badge-';
        classes += this.props.counter.value === 0 ? 'warning' : 'primary'
    }

     //viet ham dinh dang so luong dem
    formatCount(){
        const {value} = this.props.counter;
        return value === 0 ? 'zero' : value;
    }
}
export default Counter;