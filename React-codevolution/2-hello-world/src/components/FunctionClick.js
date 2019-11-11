// import React from "react";

//viet theo cach nay,clickhandler() se chi console.log ra 1 lần duy nhất khi tải trang.
// function FunctionClick(){
//     function clickHandler(){
//        console.log('button clicked');
//     }
//     return(
//         <div>
//             <button onClick={clickHandler()}>Click</button>
//         </div>
//     )
// }

// export default FunctionClick;


//cach 2:
import React from "react";

//viet theo cach nay,mỗi lần click,sẽ dc console.log ra 
function FunctionClick(){
    function clickHandler(){
        console.log('function clicked');
    }
    return(
        <div>
            <button onClick={clickHandler}>function click</button>
        </div>
    )
}
export default FunctionClick;