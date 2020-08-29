package communityuni.com.model;

public class NhanVienThoiVu extends NhanVien{
    @Override
    public void tinhLuong(int ngayCong) {
        System.out.println(100*ngayCong);
    }
}
