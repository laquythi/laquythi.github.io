package communityuni.com.model;

public class HinhTron extends Hinh {
    private double banKinh;

    // constructor
    public HinhTron(String mau, double banKinh) {
        super(mau);
        this.banKinh = banKinh;
    }
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {
        super();
    }

    // getter setter
    public double getBanKinh() {
        return banKinh;
    }
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*Math.pow(this.getBanKinh(),2);
    }

    @Override
    public double tinhChuVi() {
        return Math.PI*this.getBanKinh()*2;
    }
}
