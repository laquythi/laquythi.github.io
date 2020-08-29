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

    public abstract void tinhLuong();
}
