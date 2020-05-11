package com.company;

import java.awt.*;
import java.util.Calendar;

public class Student extends Person {
    public double score;

    //setter and getter intelliJ
    public void setScore(double score) {
        this.score = score;
    }
    public double getScore() {
        return score;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Score : " + this.getScore());
    }


}
