package communityuni.com.model;

public class NhanVien {
    private String ten;
    private int soSanPham;

    // constructor
    public NhanVien(String ten, int soSanPham) {
        super();
        this.ten = ten;
        this.soSanPham = soSanPham;
        if (soSanPham < 0){
            this.soSanPham = 0;
        }
    }

    // getter setter

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public double getLuong(){
        double donGia = 0;
        if(this.soSanPham <= 199){
            donGia = 0.5;
        }else if(this.soSanPham <= 399){
            donGia = 0.55;
        }else if(this.soSanPham <= 499){
            donGia = 0.6;
        }else{
            donGia = 0.65;
        }
        return this.soSanPham*donGia;
    }

    public boolean lonHon(NhanVien nv2){
      return this.soSanPham > nv2.soSanPham;
    };
}
