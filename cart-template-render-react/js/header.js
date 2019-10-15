// viết theo kiểu function component
// function MyHeader(props) {
//   return (
//     <header className="container">
//       <h1>Shopping Cart</h1>
//       <ul className="breadcrumb">
//         <li>trang chủ</li>
//         <li>Shopping Cart bang React</li>
//       </ul>
//       <span className="count">3 items in the bag</span>
//     </header>
//   );
// }

// viết theo kiểu class component
class MyHeader extends React.Component {
  render() {
    return (
      <header className="container">
        <h1>Shopping Cart</h1>
        <ul className="breadcrumb">
          <li>trang chủ</li>
          <li>Shopping Cart bang React</li>
        </ul>
        <span className="count">3 items in the bag</span>
      </header>
    );
  }
}
