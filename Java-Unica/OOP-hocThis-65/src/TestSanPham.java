import java.util.Scanner;

public class TestSanPham {
    public static void main(String[] args) {
        SanPham sp1;
        // cach 1
//        sp1.setMa(1);
//        sp1.setGia(10.0);
//        sp1.setTen("cocacola");
//        System.out.println(sp1);

        // cach 2
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma ");
        int ma1 = sc.nextInt();

        System.out.println("nhap ten ");
        String ten1 = sc.next();

        System.out.println("nhap gia ");
        double gia1 = sc.nextDouble();

        sp1 = new SanPham(ma1,ten1,gia1);

        System.out.println("thong tin ve san pham 1 la " + sp1);
    }
}
