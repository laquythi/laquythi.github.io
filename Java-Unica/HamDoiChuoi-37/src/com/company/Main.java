package com.company;

public class Main {

    public static void main(String[] args) {
	// 37: replace & replaceFirst
//        String fullName = "thi la quy dong son dong hung ";
//        fullName = fullName.replace("dong","bac");
//        System.out.println(fullName);


        /*38 : xoa khoang trang du thua */

//        String fullname = "  la quy   thi  ";
//        System.out.println(fullname);
//        System.out.println(fullname.length());
//
//        fullname = fullname.trim();
//        System.out.println(fullname);
//        System.out.println(fullname.length());

        // 39 : ham so sanh chuoi
//        String name1 = "l a q u y t h i";
//        String name2 = "la quy THI ";
//        int x = name2.compareTo(name1);
//        System.out.println(x);
//
//        int y = name1.compareToIgnoreCase(name2);
//        System.out.println(y);

//        String name1 = "la quy thi THAI Binh";
//        String name2 = "la quy THI thai BINH";

//        name1 = name1.toLowerCase();
//        name2 = name2.toLowerCase();
//        System.out.println(name1 + "..." + name2);
//        if(name1.equals(name2)){
//            System.out.println("name1 = name2");
//        }else{
//            System.out.println("name1 != name2");
//        }

        // 40 : ham noi chuoi
        // khi su dung toan tu + de noi chuoi,vi du name + " " + address,se lam qua trinh xu ly du lieu lau hon
        // vay nen trong thuc te,khi noi chuoi,hay dung StringBuilder.
//        String name = "la quy thi";
//        String address = "dong hung thai binh";
//        StringBuilder sb = new StringBuilder();
//        sb.append(name);
//        sb.append(" ");
//        sb.append(address);
//        System.out.println(sb);

        // 41 : ham tach chuoi
//        String infor = "1131020126;la quy thi;web front-end 4";
//        String [] arr = infor.split(";");
//        if(arr.length == 3){
//            System.out.println("ma sinh vien:"+arr[0]);
//            System.out.println("ten sinh vien:"+arr[1]);
//            System.out.println("lop:"+arr[2]);
//            System.out.println("---------");
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("---------using foreach--------");
//        for (String i :arr) {
//            System.out.println(i);
//        }

        // 42 : ham doi chu HOA-thuong
//        String name = "la quy thi dong son dong hung thai binh";
//        name = name.toUpperCase();
//        System.out.println(name);
//        String name2 = name.replace("dong","dong".toUpperCase());
//        String name2 = name.replaceFirst("dong","dong".toUpperCase());
//        String name2 = name.replaceFirst((name.charAt(0)+""),(name.charAt(0)+"").toUpperCase());
//        System.out.println(name2);
    }
}
