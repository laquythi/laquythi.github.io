package communityuni.com.model;

public abstract class NhanVien {
    private int ma;
    private String ten;

    // constructor
    public NhanVien(int ma, String ten) {
        super();
        this.ma = ma;
        this.ten = ten;
    }

    public NhanVien() {
        super();
    }

    // getter setter
    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public abstract void tinhLuong(int ngayCong);
}
