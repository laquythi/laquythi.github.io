package communityuni.com.model;

public class Question implements Complexity {
    private String answer;
    private String question;

    // constructor
    public Question() {
        super();
    }

    public Question(String question,String answer) {
        this.answer = answer;
        this.question = question;
    }

    // getter setter
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    // answer method
    public boolean answerCorrect(String answerCorrect){
//        return answerCorrect.equals(this.answer);
        return answerCorrect.equalsIgnoreCase(this.answer);
    };

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
