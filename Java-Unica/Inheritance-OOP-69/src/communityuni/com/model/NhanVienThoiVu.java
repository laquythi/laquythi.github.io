package communityuni.com.model;

public class NhanVienThoiVu extends NhanVien{

    // 2 constructor ko dc thua huong,phai tu khai bao
    public NhanVienThoiVu(){
        super();
    }
    public NhanVienThoiVu(int ma,String ten){
        super(ma, ten);
    }

    // auto render override when class NhanVienThoiVu extends class NhanVien
    @Override
    public void tinhLuong() {
        super.tinhLuong();
        System.out.println("=> day la nhan vien thoi vu");
    }
}
