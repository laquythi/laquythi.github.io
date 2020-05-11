package chap01.basic;

import com.company.Person;

public class Student extends Person {
    public double score;

    public double getScore(){
        return score;
    }

    public void setScore(double score){
        this.score = score;
    }

    public void showInfo(){
        super.showInfo();
        super.name = "abc";
        System.out.println("Score : " + this.getScore());
    }
}