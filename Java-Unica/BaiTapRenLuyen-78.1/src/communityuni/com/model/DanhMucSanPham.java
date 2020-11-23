package communityuni.com.model;

public class DanhMucSanPham {
    private int maDanhMuc;
    private String tenDanhMuc;

    // construtor
    public DanhMucSanPham() {

    }
    public DanhMucSanPham(int maDanhMuc, String tenDanhMuc) {
        super();
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
    }

    // getter setter
    public int getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

}
