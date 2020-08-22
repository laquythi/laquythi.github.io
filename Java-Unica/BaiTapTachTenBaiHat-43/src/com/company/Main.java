package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String baiHat = "D:/music/bolero/longme.mp3";
//        String kq2 = baiHaiKoMp3(baiHat);
//        System.out.println(kq2);

        String baiHat = "D:/music/bolero/longme.mp3";
        String kq = baiHaiCoMp3(baiHat);
        System.out.println("ten day du cua bai hat la : " +kq);

        String kq2 = baiHatKoMp3(baiHat);
        System.out.println("ten bai hat ko bao gom .mp3 la : " + kq2);

    }
//    public static String baiHatCoMp3(String baiHat){
//        int vtCuoi = baiHat.lastIndexOf("/");
//        String ten = baiHat.substring(vtCuoi+1);
//        return ten;
//    }
//
//    public static String baiHaiKoMp3(String baiHat){
//        int vtCuoi1 = baiHat.lastIndexOf("/");
//        int vtCuoi2 = baiHat.lastIndexOf(".");
//        String ten2 = baiHat.substring(vtCuoi1+1,vtCuoi2);
//        return ten2;
//    }

    public static String baiHaiCoMp3(String baiHat){
        int vtCuoi = baiHat.lastIndexOf("/");
        String ten = baiHat.substring(vtCuoi+1);
        return ten;
    }

    public static String baiHatKoMp3(String baiHat){
        int vtCuoi1 = baiHat.lastIndexOf("/");
        int vtCuoi2 = baiHat.lastIndexOf(".");
        String ten2 = baiHat.substring(vtCuoi1+1,vtCuoi2);
        return ten2;

    }
}
