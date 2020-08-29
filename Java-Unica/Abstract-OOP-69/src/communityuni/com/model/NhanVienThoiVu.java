package communityuni.com.model;

public class NhanVienThoiVu extends NhanVien {
    public NhanVienThoiVu() {
        super();
    }

    public NhanVienThoiVu(int ma, String ten) {
        super(ma, ten);
    }

    public void tinhLuong(){
        System.out.println("nhan vien thoi vu tinh luong ");
    }
}
