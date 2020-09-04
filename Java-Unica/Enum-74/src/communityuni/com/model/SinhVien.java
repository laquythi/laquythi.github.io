package communityuni.com.model;

public class SinhVien {
    private int ma;
    private String ten;
    private double diemTb;
    private XepLoai loai;

    public SinhVien() {
        super();
    }

    public SinhVien(int ma, String ten, double diemTb) {
        super();
        this.ma = ma;
        this.ten = ten;
        this.diemTb = diemTb;
        this.loai = getLoai();
    }

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

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    public XepLoai getLoai() {
        if(this.diemTb > 8){
            loai = XepLoai.Gioi;
        }else if(this.diemTb >= 6.5){
            loai = XepLoai.Kha;
        }else if(this.diemTb >= 5){
            loai = XepLoai.TrungBinh;
        }else{
            loai = XepLoai.Yeu;
        }
        return loai;
    }

    @Override
    public String toString() {
        return this.ma + "\t" + this.ten + "\t" + this.diemTb + "\t" + this.loai.description();
    }
}
