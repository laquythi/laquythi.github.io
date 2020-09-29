package communityuni.com.model;

public class SanPham {
    private int maSanPham;
    private String tenSanPham;
    private double giaSanPham;

    // constructor
    public SanPham(){
        System.out.println("day la constructor mac dinh");
    }

    public SanPham(int maSanPham,String tenSanPham,double giaSanPham){
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
    }

    // setter getter
    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    @Override
    public String toString() {
        return this.maSanPham + "\t" + this.tenSanPham + "\t" + this.giaSanPham;
    }

    public static double tongTien(SanPham ... phams){
        double tien = 0;
        // cach viet 1
//        for(SanPham sp : phams){
//            tien = tien + sp.giaSanPham;
//        }

        // cach viet 2
        for (int i = 0; i < phams.length; i++) {
            tien = tien + phams[i].giaSanPham;
        }
        return tien;
    }
}
