package communityuni.com.model;

public class MiniQuiz {
    public static void main(String[] args) {
        Question question1 = new Question("thu do cua viet nam la ","hai phong");
        System.out.println("cau hoi so 1 : " + question1.getQuestion() + "\ncau tra loi 1 : " + question1.getAnswer());

        Question question2 = new Question("thu do cua My la ","DC");
        System.out.println("cau hoi so 2 : " + question2.getQuestion() + "\ncau tra loi 2 : " + question2.getAnswer());

        if(question1.answerCorrect("ha noi") == true){
            System.out.println("ban tra loi dung cau so 1");
        }else{
            System.out.println("ban tra loi sai cau so 1,dap an dung la " + "ha noi");
        }

        boolean dapAn2 = question2.answerCorrect("DC");
        if(dapAn2 == true){
            System.out.println("ban tra loi dung cau hoi so 2");
        }else{
            System.out.println("ban tra loi sai cau hoi so 2");
            System.out.println("dap an dung cau 2 la DC");
        }
    }
}