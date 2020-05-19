package com.trungtamjava.doituong;

public class Nguoi {
    String ten;
    String diaChi;
    int age;
    public void diLai(String ten){
        System.out.println(ten + " di lai");
    }
    public void khaNang(String ten){
        System.out.println(ten + " co the ho tro ky thuat,va co the code back-end");
    }

    public static void main(String[] args){
        new Nguoi(); // object 1
        Nguoi manA = new Nguoi(); // object 2;
        Nguoi manB = new Nguoi(); // object 3;
        Nguoi womanA = new Nguoi();

        manA.diLai("thilq");
        womanA.khaNang("pham thi thu");
        manB.khaNang("la quy thi");
    }

}
