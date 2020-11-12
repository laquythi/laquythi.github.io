package com.company;

public class Main {

    public static String toiUu(String s){
        String sToiUu = s;
        sToiUu = sToiUu.trim();
        String []arrWord = sToiUu.split(" ");
        sToiUu = "";
        for (String word:arrWord) {
            String newWord = word.toLowerCase();
            if(newWord.length() > 0){
                newWord = newWord.replaceFirst(newWord.charAt(0) + "",(newWord.charAt(0)+"").toUpperCase() );
                sToiUu = sToiUu + newWord + " ";
            }
        }
        return  sToiUu.trim();
    }

    public static void main(String[] args) {
	// write your code here
        String s = "    lA   qUy THI ";
        System.out.println(s);
        String sToiUu = toiUu(s);
        System.out.println(sToiUu);
    }
}
