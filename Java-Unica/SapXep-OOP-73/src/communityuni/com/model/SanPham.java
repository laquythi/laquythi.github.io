package communityuni.com.model;

public class SanPham implements Comparable<SanPham>{
    private int ma;
    private double gia;
    private String ten;

    public SanPham() {
        super();
    }

    public SanPham(int ma, int gia, String ten) {
        super();
        this.ma = ma;
        this.gia = gia;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return this.ma + "\t" + this.ten + "\t" + this.gia;
    }

    @Override
    public int compareTo(SanPham o) {
        // so sanh san pham theo gia tang dan
        // neu muon sort gia giam dan chi can thay dk : this.gia < o.gia return 1,va nguoc lai
//        if(this.gia < o.gia){
//            return -1;
//        }if(this.gia > o.gia){
//            return 1;
//        }

        // sap xep san pham theo ten. a -> z
//        return this.ten.compareToIgnoreCase(o.ten);

        // sap xep san pham theo ten giam dan z -> a
        return this.ten.compareToIgnoreCase(o.ten)* -1;
//        return 0;
    }
}
