package communityuni.com.model;

public class NhanVien implements Cloneable{
    private int ma;
    private String ten;

    // constructor
    public NhanVien(int ma,String ten){
        this.ma = ma;
        this.ten = ten;
    }

    public NhanVien copy(){
        try {
            return (NhanVien) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
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
}
