public class SanPham {
    private int ma; // instance variable
    private String ten; // instance variable
    private double gia; // instance variable

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) { // int ma : local variable
        this.ma = ma; // this.ma -> ma(instance variable). ma -> local variable
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) { // String ten : local variable
        this.ten = ten; // this.ten -> ten(instance variable). ten -> local variable
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) { // double gia : local variable
        this.gia = gia; // this.gia -> gia(instance variable). gia -> local variable
    }

    @Override
    public String toString() {
        return this.ma + " - " + getTen() + "," + getGia() ;
    }
}
