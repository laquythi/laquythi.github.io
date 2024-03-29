package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("please enter the string : ");
        Scanner sc = new Scanner(System.in);

        String address = sc.nextLine();

        char c=firstNonRepeatedCharacter(address);
        System.out.println("The first non repeated character is :  " + c);

    }

    public static Character firstNonRepeatedCharacter(String str)
    {
        HashMap<Character,Integer> characterhashtable=
                new HashMap<Character ,Integer>();
        int i,length ;
        Character c ;
        length= str.length();  // Scan string and build hash table
        for (i=0;i < length;i++)
        {
            c=str.charAt(i);
            if(characterhashtable.containsKey(c))
            {
                // increment count corresponding to c
                characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
            }
            else
            {
                characterhashtable.put( c , 1 ) ;
            }
        }
        // Search characterhashtable in in order of string str

        for (i =0 ; i < length ; i++ )
        {
            c= str.charAt(i);
            if( characterhashtable.get(c)  == 1 )
                return c;
        }
        return null ;
    }
}
