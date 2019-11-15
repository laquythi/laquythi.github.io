import React , {Component, PureComponent} from "react";
import MemoComp from "./MemoComp";

class ParentComp extends PureComponent{
    constructor(props){
        super(props)
        this.state = {
            name : 'thi la quy'
        };
    }
    componentDidMount(){
        setInterval(() => {
            this.setState({
                name : 'la quy thi'
            })
        },2000)
    }

    render(){
        console.log('1 parent component');
        return(
            <div>
                Parent Component
                {/* <RegComp name = {this.state.name} />
                <PureComp name={this.state.name} /> */}
                <MemoComp name={this.state.name} />
            </div>
        )
    }
}

export default ParentComp;