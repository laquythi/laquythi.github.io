package communityuni.com.model;

public abstract class NhanVien {
    private int ma;
    private String ten;

    // constructor
    public NhanVien() {

    }
    public NhanVien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    // getter & setter
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

    public abstract void tinhLuong();
}
