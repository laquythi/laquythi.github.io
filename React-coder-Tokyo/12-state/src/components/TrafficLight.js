import React from "react";
import './TrafficLight.css';
import classNames from 'classnames';

const RED = 0;
const ORANGE = 1;
const GREEN = 2;

class TrafficLight extends React.Component{
    constructor(){
        super();
        this.state = {
            currentColor : GREEN
        };
        setInterval(()=>{
            this.setState({
                currentColor : this.getNextColor(this.state.currentColor)
            });
        },1000);
    }
    
    render(){
        const {currentColor} = this.props;
        console.log('Redering...',currentColor);
        return(
           <div className="TrafficLight">
                <div className={classNames('bulb','red',{
                    active:currentColor ===  RED
                })} />
                <div className={classNames('bulb','orange',{
                    active:currentColor ===  ORANGE
                })} />
                <div className={classNames('bulb','green',{
                    active:currentColor ===  GREEN
                })} />
           </div>
        )
    }
}

export default TrafficLight;