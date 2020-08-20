package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String baiHat = "D:/music/bolero/longme.mp3";
        String kq = baiHatCoMp3(baiHat);
        System.out.println(kq);

        String kq2 = baiHaiKoMp3(baiHat);
        System.out.println(kq2);
    }
    public static String baiHatCoMp3(String baiHat){
        int vtCuoi = baiHat.lastIndexOf("/");
        String ten = baiHat.substring(vtCuoi+1);
        return ten;
    }

    public static String baiHaiKoMp3(String baiHat){
        int vtCuoi1 = baiHat.lastIndexOf("/");
        int vtCuoi2 = baiHat.lastIndexOf(".");
        String ten2 = baiHat.substring(vtCuoi1+1,vtCuoi2);
        return ten2;
    }
}
