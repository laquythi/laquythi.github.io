import React from "react";

class Counter extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            count : 0
        }
    }
    //viet cach 1:cách này count chỉ tăng dần trong console f12;
    // increment(){
    //     this.state.count = this.state.count + 1;
    //     console.log(this.state.count);
    // }

    //viet cach 2: cách này count tăng dần ngay trên browwer
    increment(){
        // this.setState({
        //     count : this.state.count + 1
        // },()=>{console.log('callback value',this.state.count)})
        // console.log(this.state.count);
        this.setState((prevState)=>({
            count : prevState.count + 1
        }))
        console.log(this.state.count);
    }
    incrementFive(){
        this.increment()
        this.increment()
        this.increment()
        this.increment()
        this.increment()
    }
    render(){
        return (
            <div>
                <div>
                    Count - {this.state.count}
                </div>
                <button onClick={()=>this.incrementFive()}>Increment</button>
            </div>
        )
    }
}

export default Counter;