package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here
        // 1 : nhap vao 1 mang bat ky co n phan tu,sau do kiem tra mang do co phai la mang doi xung hay ko?
//        int[] arr;
//        int n;
//        System.out.print("moi ban nhap so phan tu cua mang : ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        arr = new int[n];
//        System.out.print("so phan tu cua mang la : " + n + "\n");
//        for(int i = 0;i < arr.length;i++){
//            System.out.println("moi ban nhap phan tu thu " + i);
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("mang ban vua nhap la : " + Arrays.toString(arr));

        // kiem tra mang co doi xung ko?
//        int m = arr.length;
//        int count = 0;
//        for(int i = 0;i < m;i++){
//            if(arr[i] == arr[m - i - 1] ){
//                count++;
//            }
//        }

//        if(count == m){  // 1 4 1
//            System.out.println("mang ban vua nhap la mang doi xung");
//        }else{
//            System.out.println("mang ban vua nhap ko doi xung");
//        }

        // 2 : nhap 1 mang a co n phan tu. dem so lan xuat hien cua tung phan tu trong mang
        // in ra phan tu xuat hien nhieu nhat + so lan xuat hien.

//        int[] arr;
//        int n;
//        System.out.print("moi ban nhap so phan tu cua mang : ");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        arr = new int[n];
//        System.out.print("so phan tu cua mang la : " + n + "\n");
//        for(int i = 0;i < arr.length;i++){
//            System.out.println("moi ban nhap phan tu thu " + i);
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("mang ban vua nhap la : " + Arrays.toString(arr));
//
//        int count = 0;
//        int temp = 0;
//        for(int i = 0;i< arr.length;i++){
//            for(int j = 0;j < arr.length;j++){
//                if(arr[j] > arr[i]){
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//        System.out.println("so lon nhat trong mang la : " + temp);
//        for(int i = 0;i < arr.length;i++){
//            if(arr[i] == temp){
//                count++;
//            }
//        }
//        System.out.println(temp + " xuat hien " + count + " lan trong mang");

        // 3: doc chua hieu de bai lam

        // 4 : tao mang a co n phan tu,sap xep mang a theo thu tu tang dan,loai bo bot cac ptu trung nhau sao cho
        // moi gia tri ptu chi xuat hien 1 lan trong mang  . chua lam dc phan loai bo bot phan tu.
//        int[] arr;
//        int temp, n;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("moi ban nhap so phan tu : ");
//        n = sc.nextInt();
//        arr = new int[n];
//        System.out.println("so phan tu cua mang la : " + n);
//        for (int i = 0; i < n; i++) {
//            System.out.print("nhap phan tu thu " + i + " ");
//            arr[i] = sc.nextInt();
//        }
//        // sap xep theo thu tu tang dan
//        for (int i = 0; i < (n - 1); i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println("mang sau khi sap xep la : ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // 5 : nhap 2 mang a[n], b[m] , 1 so p (0 <= p <= n)
        // hay chen mang b vao vi tri p cua a. vi du a[4,7,3,5] b[1,4,2,3] p = 2 => a[8] = {4,7,1,4,2,3,3,5};
        // clone code cua than trieu,xem tai file Exercise2-bai5

        // 6 :
    }


}
