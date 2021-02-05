import React, { Component } from 'react';

class TestProps extends Component {
    componentWillReceiveProps(nextProps, nextState){
        console.log('componentWillReceiveProps thuc hien cho props');
    }
    shouldComponentUpdate(nextProps, nextState) {
        console.log('shouldComponentUpdate thuc hien cho props');
        return true;
    }
    componentWillUpdate(nextProps, nextState) {
        console.log('componentWillUpdate thuc hien cho props');
    }
    componentDidUpdate(prevProps, prevState) {
        console.log('componentDidUpdate thuc hien cho props');
    }
    
    
    render() {
        console.log('ham render da chay trong test props');
        return (
            <div>
                <h4>props duoc lay tu : {this.props.nameOfProps}</h4>
            </div>
        );
    }
}

export default TestProps;