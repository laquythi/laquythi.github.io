package communityuni.com.test;

import communityuni.com.model.NhanVien;
import communityuni.com.model.NhanVienChinhThuc;
import communityuni.com.model.NhanVienThoiVu;

public class TestNhanVien {
    public static void main(String[] args) {
        NhanVienChinhThuc thi = new NhanVienChinhThuc();
        thi.tinhLuong(19);

        NhanVienThoiVu toan = new NhanVienThoiVu();
        toan.tinhLuong(20);
    }
}
