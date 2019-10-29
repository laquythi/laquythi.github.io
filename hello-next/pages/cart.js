import Link from "next/link";

const Cart = () => (
  <div>
    <Link href="/">
      <a>Home Page</a>
    </Link>

    <Link href="/cart">
      <a>Shopping Cart</a>
    </Link>

    <h1>Shopping Cart</h1>
  </div>
);

export default Cart;
