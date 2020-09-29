package communityuni.com.model;

public class SinhVien implements ILamViec,IGiaiTri {


    @Override
    public void complexity() {
        System.out.println("complexity");
    }

    @Override
    public void difficulty() {
        System.out.println("difficulty");
    }

    @Override
    public void hatHo() {
        System.out.println("relax");
    }
}
