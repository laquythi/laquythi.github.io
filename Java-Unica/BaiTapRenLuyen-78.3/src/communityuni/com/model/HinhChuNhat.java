package communityuni.com.model;

public class HinhChuNhat extends Hinh {
    private double chieuDai;
    private double chieuRong;

    // constructor
    public HinhChuNhat(String mau, double chieuDai, double chieuRong) {
        super(mau);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat() {
        super();
    }

    // getter setter
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    // chi can khai bao HinhChuNhat extends Hinh, override tu dong render
    @Override
    public double tinhDienTich() {
        return this.getChieuDai()*this.getChieuRong();
    }

    @Override
    public double tinhChuVi() {
        return (this.getChieuDai()*2) + (this.getChieuRong()*2);
    }
}
