package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] arr = new int[]{5,3,2,5,3,6,7,8,4,2,8};
//        Arrays.sort(arr);
//        System.out.println("mang cac so sau khi sap xep : " + Arrays.toString(arr));

//        String[] names = {"thi","anh","phong","trang","thi","tra","nhung"};
//        Arrays.sort(names);
//        System.out.print("mang sau khi sap xep " + Arrays.toString(names));
//        int index = Arrays.binarySearch(names,"thi");
//        System.out.print("\n" + "Index = " + index);

//        String[] names = {"dong","son","dong","hung","thai","binh","ha","noi"};
//        Arrays.sort(names);
//        System.out.print("mang sau khi sx la : " + Arrays.toString(names));
//        int index = Arrays.binarySearch(names,"thai");
//        System.out.println("\n Index = " + index);

//        String[] names = {"thi","phong","nhung","trang","ngan","tra","anh"};
//
//        String[] names2 = Arrays.copyOf(names, 4);
//
//        System.out.print("names = " + Arrays.toString(names) + "\n");
//        System.out.print("names2 = " +  Arrays.toString(names2) + "\n");
//
//        System.out.println("names == names2 ? " + Arrays.equals(names,names2));

        // create a new array and push value,use fill method.
        int[] arr = new int[20];
        Arrays.fill(arr,1991);
        System.out.println(Arrays.toString(arr)); // [1991,1991,...,1991]
    }
}
