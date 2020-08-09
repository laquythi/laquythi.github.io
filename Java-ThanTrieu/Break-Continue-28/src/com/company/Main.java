package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 0;
        int count = 0;
        while(i < 100){
            if (i % 3 == 0){
                System.out.println(i);
                count++;
            }
            i+=2;
            if(count == 6){
                continue;
            }
        }
    }
}
