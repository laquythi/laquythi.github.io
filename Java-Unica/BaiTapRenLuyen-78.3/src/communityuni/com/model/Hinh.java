package communityuni.com.model;

public abstract class Hinh {
    private String mau;

    // constructor
    public Hinh(String mau) {
        this.mau = mau;
    }
    public Hinh() {
        super();
    }

    // getter setter
    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public abstract double tinhDienTich();
    public abstract double tinhChuVi();

    public abstract String layThongTin();

}
