package communityuni.com.model;

public class Question implements Complexity {
    private String answer;
    private String question;

    // getter setter
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    // constructor
    public Question() {
        super();
    }

    // method
    public String getQuestion(){
        return this.getQuestion();
    };
    public String getAnswer(){
      return this.getQuestion();
    };
    public boolean anserCorrect(String anserCorrect){
        if(anserCorrect.equals(this.answer)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // auto render overriding
    @Override
    public int getComplexity() {
        return this.getComplexity();
    }
    @Override
    public void setComplexity() {

    }
}
