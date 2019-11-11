// import React from "react";

// class ClassClick extends React.Component{
//     clickHandler(){
//         console.log('clicked button');
//     }
//     render(){
//         return(
//             <div>
                    // clickHandler viết trong class,nên ở đây phải dùng thêm this.clickHandler
                    // viết cách này,click handler sẽ dc console.log mỗi khi click.
//                 <button onClick={this.clickHandler}>Click me</button>
//             </div>
//         )
//     }
// }
// export default ClassClick;

import React from "react";

class ClassClick extends React.Component{
    clickHandler(){
        console.log('class clicked');
    }
    render(){
        return(
            <div>
                <button onClick={this.clickHandler()}>class click</button>
            </div>
        )
    }
}

export default ClassClick;