package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("la quy ");
        stringBuilder.append("thi");
        stringBuilder.insert(10," dong hung");
        String name = stringBuilder.toString();
        System.out.println(name);

        String reverseName = stringBuilder.reverse().toString();
        System.out.println(reverseName);
    }
}
