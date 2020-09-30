package communityuni.com.model;

public class HinhVuong extends HinhChuNhat{

    // constructor
    public HinhVuong(String mau, double chieuDai, double chieuRong) {
        super(mau, chieuDai, chieuRong);
    }

    public HinhVuong(double chieuDai, double chieuRong) {
        super(chieuDai, chieuRong);
    }

    // them 1 constructor co tham so doRong
    public HinhVuong(String mau,double doRong) {
        super(mau,doRong,doRong);
    }

    public String layThongTin() {
        return "------------------\nmau sac - " + this.getMau() + "\ndien tich - " + this.tinhDienTich() + "\nchu vi - " + this.tinhChuVi();
    }
}
