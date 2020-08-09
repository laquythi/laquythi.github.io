package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 :nhap vao kich thuoc chieu rong va chieu cao,sau do in ra hinh chu nhat hoac hinh vuong bang dau *, DONE
//        Scanner sc = new Scanner(System.in);
//        int m,n,i,j;
//        System.out.println("nhap m:");
//        m = sc.nextInt();
//        System.out.println("nhap n:");
//        n = sc.nextInt();
//        for(i = 0;i<=m;i++){
//            for(j = 0;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

        // 2 : giong bai 1,nhung in ra hinh chu nhat hoac hinh vuong nhung rong ben trong, DONE tuy nhien van chua in
        // ra 1 hinh vuong,neu nhu nhap chieu rong = chieu cao.
//        Scanner sc = new Scanner(System.in);
//        int m,n,i,j;
//        System.out.println("nhap m:");
//        m = sc.nextInt();
//        System.out.println("nhap n:");
//        n = sc.nextInt();
//        for(i=0;i<=m;i++){
//            for(j=0;j<=n;j++){
//                if( (j > 0 && j < n ) && ( i > 0 && i < m ) ){
//                    System.out.print("\t");
//                }else{
//                    System.out.print("*\t");
//                }
//            }
//            System.out.println("");
//        }

        // 3 : nhap vao chieu cao va in ra nhu hinh: trong video. Clone code,chua hieu lam.
//        int h;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("nhap chieu cao:");
//        h = scanner.nextInt();
//        int x, output;
//
//        for(int i = 1;i<= h; i++){
//            for(int j = 0; j<= 2*h; j++){
//                x = j-h;
//                if(x < 0){
//                    x *= -1;
//                }
//                output = i - x;
//
//                if(output > 0){
//                    System.out.printf("%3d", output);
//                } else{
//                    System.out.printf("   ");
//                }
//            }
//            System.out.println();
//        }

        // 4 : viet chuong trinh in ra bang cuu chuong. DONE
//        for(int i=1;i<=9;i++){
//            System.out.println("bang cuu chuong " + i + " la:");
//            for(int j=1;j<=9;j++){
//                System.out.println(i + " * " + j + " = " + i*j);
//            }
//            System.out.println("");
//        }

        // 5 : viet chuong trinh nhap vao 1 so nguyen trong khoang 0 ... 100,sau do lay lan luot cac so trong khoang nay
        // cho den khi co 1 gia tri bang dung gia tri nhap vao, in ra ket qua tung buoc va so buoc phai thuc hien.
        // chua hieu de bai lam

        // 6 : viet chuong trinh tinh tong S = 1 + 3 + 5 + ... + n (neu n le). S = 2 + 4 + 6 + ... + n (neu n chan). DONE
//        int n;
//        int res = 0;
//        System.out.println("nhap N:");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
        // cach 1:
//        if(n % 2 == 0 ){
//            for(int i = 2;i<=n;i+=2){
//                res = res + i;
//            }
//        }else{
//            for(int i = 1;i <= n;i+=2){
//                res = res + i;
//            }
//        }
//        System.out.println(res);

        // 7 : nhap 1 so n roi tinh tong S = 1/1 + 1/2 + 1/3 + ... + 1/n. DONE(tham khao code)
//       Scanner sc = new Scanner(System.in);
//       System.out.print("nhap n : ");
//       int n = sc.nextInt();
//       double s = 0;
//       for(int i=1;i<=n;i++){
//           s = s + (double)1/i;
//       }
//        System.out.printf("s = %8.3f",s);

        // 8 : nhap so tu nhien n roi liet ke cac uoc so cua no,co bao nhieu uoc so. DONE
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap n : ");
//        int n = sc.nextInt();
//        int uocSo = 0;
//        for(int i=1;i<=n;i++){
//            if(n % i == 0){
//                System.out.print(i + " ");
//                uocSo++;
//            }
//        }
//        System.out.println("\n" + n + " co so uoc so la : " + uocSo);

        // 9 : viet ct tinh tong cac chu so cua 1 so nguyen bat ky,vi du 342 => 3 + 4 + 2.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap N :");
//        int n = sc.nextInt();
//        int sum = 0;
//        int x;
//        while(n > 0){
//            x = n % 10;
//            n = n / 10;
//            sum = sum + x;
//        }
//        System.out.println(sum);

        // c2 :
//        Scanner sc = new Scanner(System.in);
//        System.out.print("nhap n : ");
//        int n = sc.nextInt();
//        int sum = 0;
//        int x;
//        do {
//            x = n % 10;
//            n = n / 10;
//            sum = sum + x;
//        }while (n > 0);
//        System.out.print("tong cac chu so co trong " + n + " la " + sum);

        // 10 : viet chuong trinh phan tich 1 so nguyen thanh cac thua so nguyen to,vi du 28 = 2*2*7.

        // 11 : viet chuong trinh liet ke n so nguyen to dau tien.
        // clone code ( viet tai java exercises bai 11)

        // 12 : nhap N (2 <= n <= 90),viet chuong trinh in ra N so Fibonacci dau tien.
        // dang co bug,khi nhap n,sau do chuong trinh in ra n+1 so Fibonacci ???
//        Scanner sc = new Scanner(System.in);
//        System.out.print("nhap N : ");
//        int n = sc.nextInt();
//        long f0 = 0,f1 = 1,fn = 0;
//        for(int i = 0;i <= n; i++){
//            if(i < 2){
//                System.out.print(i + " ");
//            }else {
//                fn = f0 + f1;
//                f0 = f1;
//                f1 = fn;
//                System.out.print(fn + " ");
//            }
//        }

        // 13 : viet ct liet ke tat ca cac so thuan nghich co 6 chu so.
//        int count = 0;
//        for(int i = 100000;i<=999999;i++){
//            int tmp = 0;
//            int n = i;
//            while (n > 0){
//                tmp = tmp*10 + n%10;
//                n = n / 10;
//            }
//            if(i == tmp){
//                System.out.printf("%10d",i);
//                count++;
//                if(count % 10 == 0){
//                    System.out.println();
//                }
//            }
//        }

        // 14 : nhap vao 2 so m,n(m<n),hay liet ke cac so chinh phuong trong doan [m,n], tinh xem co bao nhieu so chinh phuong.
//        Scanner sc = new Scanner(System.in);
//        int m,n;
//        int count = 0;
//        System.out.print("nhap m : ");
//        m = sc.nextInt();
//        System.out.print("nhap n : ");
//        n = sc.nextInt();
//        if( (m >= 0) && (n >= 0) && (m < n) ){
//            for(int i = m;i <= n; i++){
//                int res = (int) Math.sqrt(i);
//                if(res * res == i){
//                    count++;
//                    System.out.print(i + " ");
//                    if(count % 10 == 0){
//                        System.out.println();
//                    }
//                }
//            }
//            System.out.print("so luong so chinh phuong la " + count);
//        }

        // 15 : xem de bai trong video.

    }
}
