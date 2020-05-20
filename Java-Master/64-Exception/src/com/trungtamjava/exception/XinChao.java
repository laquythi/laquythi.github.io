package com.trungtamjava.exception;

public class XinChao {
    // du trong try dung hay sai,cau lenh trong finally van duoc thuc hien,va finally luon phai o duoi cung
    public static void main(String[] args) {
        int[] mang = {1,5,2};
        try {
            System.out.println(mang[6]);
        }catch (Exception e){
            System.out.println("error " + e);
        }finally {
            System.out.println("finally");
        }
        System.out.println("ket thuc");
    }
}
