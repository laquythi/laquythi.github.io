package communityuni.com.model;

public class SinhVien {
    private String hoTen;
    private Double diem;

    // constructor
    public SinhVien(String hoTen,Double diem){
        this.hoTen = hoTen;
        this.diem = diem;
//        System.out.println("day la constructor co doi so.");
    }

    public SinhVien(){
//        System.out.println("day la constructor mac dinh");
        this.hoTen = "random name";
    }

    // getter setter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public void xuatThongTin(){
        System.out.println(this.hoTen + "->" + this.diem);
    }

    // toString method

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen='" + hoTen + '\'' + ", diem=" + diem + '}';
    }
}
