import Link from "next/link";
const Menu = () => (
  <nav>
    <Link href="/">
      <a>Home Page</a>
    </Link>
    <Link href="/about">
      <a>About my page</a>
    </Link>
    <Link href="/products">
      <a>Product</a>
    </Link>
  </nav>
)

export default Menu;
 //3: trong components menu có 2 thẻ link,link đến HomePage và About

