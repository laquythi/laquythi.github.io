package com.company;

public class Main {
    public static void ptBac1(int a,int b) throws Exception{
        // throw exception xay ra khi dev trong qua trinh phat trien chuong trinh co thay xay ra loi
        // nhung ko biet mong muon sua loi nay cua cac dev khac nhu nao,nen dung throw de nem loi ra cho dev khac xu ly.
        try {
            System.out.println("x = " + (-b/a));
        }catch (Exception ex){
            throw ex;
        }
    }

    public static void main(String[] args) {
	// write your code here
        try {
            ptBac1(0,5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
