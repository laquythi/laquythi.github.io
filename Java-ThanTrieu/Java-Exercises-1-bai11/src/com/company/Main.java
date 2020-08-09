package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 11 : viet chuong trinh liet ke n so nguyen to dau tien.
        // bai nay clone code.dang co bug : cac so nguyen to chi in ra tu so 2 tro di(ko co so 1);
        int n;
        n = new Scanner(System.in).nextInt();
        int count = 0;
        int x = 2;
        while(true){
            if(isNgTo(x)){
                System.out.print(x+" ");
                count++;
            }
            if(count == n){
                break;
            }
            if(x == 2)
                x++;
            else{
                x+= 2;
            }
        }
    }

    public static boolean isNgTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
