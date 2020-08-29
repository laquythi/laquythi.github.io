package communityuni.com.model;

public class NhanVienChinhThuc extends NhanVien{
    // override la truong hop tap hop cac lop co quan he huyet thong(cha,con)
    // cac phuong thuc(vi du o day tinhLuong) giong nhau o cac lop quan he huyet thong,co cung signature(int),khac nhau ve noi dung ham
    @Override
    public void tinhLuong(int ngayCong) {
        if(ngayCong < 20){
            System.out.println("ban nhan luong 7.000.000");
        }else{
            System.out.println("ban nhan luong 10.000.000");
        }
    }
}
