package communityuni.com.model;

public class HinhChuNhat extends HinhHoc {
    public HinhChuNhat() {
        super();
    }

    public HinhChuNhat(int chieuDai, int chieuRong) {
        super(chieuDai, chieuRong);
    }

    @Override
    public double tinhChuVi() {
        return (this.getChieuDai() + this.getChieuRong())*2;
    }

    @Override
    public double tinhDienTich() {
        return this.getChieuDai()*this.getChieuRong() ;
    }
}
