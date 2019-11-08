import MainHeader from "./main-header";
import MainMenu from "./main-menu";
import MainBreakCrumb from "./main-breadcrumb";
import Footer from "./footer";

const MainLayout = props => (
  <div>
    <MainHeader />
    <MainMenu />
    <MainBreakCrumb />
    {props.children}
    <Footer />
  </div>
);
export default MainLayout;
//2: trong main layout có 2 component là menu và footer.
//nằm giữa menu và footer có 1 props con(props.children) chính là
// thẻ h1 của mainlayout.
//xem tiếp trong component menu và footer;