package communityuni.com.model;

import java.util.Scanner;

public class MiniQuiz {
    public static void main(String[] args) {
        // bai nay van chua hieu thuc su de bai la gi,van chua goi den class Complexity

        // cach 1 : cach cu
//        Question question1 = new Question("thu do cua viet nam la ","hai phong");
//        System.out.println("cau hoi so 1 : " + question1.getQuestion() + "\ncau tra loi 1 : " + question1.getAnswer());
//
//        Question question2 = new Question("thu do cua My la ","DC");
//        System.out.println("cau hoi so 2 : " + question2.getQuestion() + "\ncau tra loi 2 : " + question2.getAnswer());
//
//        if(question1.answerCorrect("ha noi") == true){
//            System.out.println("ban tra loi dung cau so 1");
//        }else{
//            System.out.println("ban tra loi sai cau so 1,dap an dung la " + "ha noi");
//        }
//
//        boolean dapAn2 = question2.answerCorrect("DC");
//        if(dapAn2 == true){
//            System.out.println("ban tra loi dung cau hoi so 2");
//        }else{
//            System.out.println("ban tra loi sai cau hoi so 2");
//            System.out.println("dap an dung cau 2 la DC");
//        }

        // cach 2 :
        Scanner sc = new Scanner(System.in);
//        Complexity complexity;
        Question question1;

        System.out.println("nhap cau hoi 1 : ");
        String q1 = sc.nextLine();

        System.out.println("nhap dap an cau 1 : ");
        String a1 = sc.nextLine();

        System.out.println("nhap cau hoi 2 : ");
        String q2 = sc.nextLine();

        System.out.println("nhap dap an cau 2 : ");
        String a2 = sc.nextLine();

        question1 = new Question(q1,a1);
        System.out.println("cau hoi 1 : " + q1 + "\ndap an 1 : " + a1);

        Question question2;
        question2 = new Question(q2,a2);
        System.out.println("cau hoi 2 : " + q2 + "\ndap an 2 : " + a2);

        boolean dapAn1 = question1.answerCorrect("DC");
        if(dapAn1){
            System.out.println("ban tra loi dung cau so 1.");
        }else{
            System.out.println("ban tra loi sai cau so 1,dap an dung la : DC");
        }

        if(question2.answerCorrect("London")){
            System.out.println("ban tra loi dung cau so 2.");
        }else{
            System.out.println("ban tra loi sai,dap an dung la London.");
        }

    }
}