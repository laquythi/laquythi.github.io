package communityuni.com.model;

public class SinhVien {
    // overloadding: nap chong phuong thuc
    // 2 hoac nhieu hon cac phuong thuc trung ten,nhung khac nhau doi so truyen vao
    private int ma;
    private String ten;
    private double diem;

    public SinhVien(){

    }
    public SinhVien(int ma){
        this();
        this.ma = ma;
    }
    public SinhVien(int ma,String ten){
        this(ma); // tai su dung ma da khai bao o constructor ben tren
        this.ten = ten;
    }
    public SinhVien(int ma,String ten,Double diem){
        this(ma, ten); // tai su dung ma,ten da khai bao o constructor ben tren
        this.diem = diem;
    }

    public void xetTotNghiep(){
        if(this.diem > 5){
            System.out.println("du dieu kien tot nghiep");
        }else{
            System.out.println("ko du dieu kien tot nghiep");
        }
    }

    // phuong thuc nay sai ve kieu tra ve,con dc goi la khac nhau ve signature
//    public String xetTotNghiep(){
//
//    }

    // overloadding method,co them 1 doi so truyen vao
    public void xetTotNghiep(double diem){
        System.out.println("diem so cua ban la " + diem);
    }

    // overloadding method,co them 2 doi so truyen vao
    public void xetTotNghiep(double diem,int vungUuTien){
        System.out.println("diem so cua ban la " + diem + " vung uu tien " + vungUuTien);
    }

    public void dangKyHocPhan(int m1){

    }

    public void dangKyHocPhan(String m1){

    }
}
