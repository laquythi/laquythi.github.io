package communityuni.com.model;

public abstract class HinhHoc {
    private int chieuDai;
    private int chieuRong;

    // constructor
    public HinhHoc() {
        super();
    }

    public HinhHoc(int chieuDai, int chieuRong) {
        super();
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // getter setter
    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
}
