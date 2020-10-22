package communityuni.com.model;

public class NhanVienChinhThuc extends NhanVien{

    public NhanVienChinhThuc() {
        super();
    }

    public NhanVienChinhThuc(int ma, String ten) {
        super(ma, ten);
    }

    // auto render tinhLuong method
    public void tinhLuong(){
        System.out.println("nhan vien chinh thuc goi luong ");
    }
}
