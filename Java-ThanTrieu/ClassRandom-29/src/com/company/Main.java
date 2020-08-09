package com.company;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        long x = random.nextLong();
        for(int i=0;i<10;i++){
            System.out.println(i + " x = " + x);
            x = random.nextLong();
        }
    }
}
