package communityuni.com.test;

import communityuni.com.model.LeanStatic;

public class TestLearnStatic {
    public static void main(String[] args) {
        LeanStatic ls = new LeanStatic();
        ls.setA(113);

        LeanStatic ls2 = new LeanStatic();
        System.out.println(ls2.getA()); // 113

        LeanStatic ls3 = new LeanStatic();
        System.out.println(ls3.getA()); // 113

        ls3.setA(115);
        System.out.println(ls.getA()); // 115

        LeanStatic.fn1(); // LearnStatic chi goi dc den fn1 ?? fn1 dang o dang "static void"
        // fn1 "static void" nen ko can tao doi tuong cho class LeanStatic,co the goi truc tiep LeanStatic toi fn1().

        ls.fn2(); // ls chi goi dc den fn2 ?? fn2 dang o dang "void"
        // fn2 "void" (ko co static) nen phai tao moi doi tuong LeanStatic ls,sau do moi goi dc fn2().
    }
}
