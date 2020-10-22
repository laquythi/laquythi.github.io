package communityuni.com.model;

public class LeanStatic {
    private static int a;

    public void setA(int value) {
        a = value; // a la instance variable,value la local variable,a va value co ten ko giong nhau
        // nen co the(chi can) viet a = value.
    }
    public int getA() {
        return a;
    }

    public static void fn1(){
        // fn1 o dang static, khi truy xuat ko can tao doi tuong LeanStatic ls = new LeanStatic.
        // chi can goi LeanStatic.fn1();
    }

    public void fn2(){
        // fn2 ko o dang static,nen khi truy xuat can phai tao doi tuong LeanStatic ls = new LeanStatic
        // ls.fn2();
    }
}
