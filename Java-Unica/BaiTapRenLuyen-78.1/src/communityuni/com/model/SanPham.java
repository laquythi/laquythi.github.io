package communityuni.com.model;

public class SanPham extends DanhMucSanPham {
    private int maSanPham;
    private String tenSanPham;
    private double giaSanPham;
    private String xuatXu;

    // constructor
    public SanPham() {
    }
    public SanPham(int maSanPham, String tenSanPham, double giaSanPham, String xuatXu) {
        super();
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.xuatXu = xuatXu;
    }

    public SanPham(int maDanhMuc, String tenDanhMuc, int maSanPham, String tenSanPham, double giaSanPham, String xuatXu) {
        super(maDanhMuc, tenDanhMuc);
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.xuatXu = xuatXu;
    }

    // getter setter
    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }
}
