package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// viet chuong trinh nhap vao ngay thang nam sinh kieu chuoi,dung SimpleDateFormat chuyen qua DateTime
        // sau do xuat tuoi, tuoi = namHienTai - namSinh.

        Calendar cal = Calendar.getInstance();
        int yearNow = cal.get(Calendar.YEAR);

        System.out.println("moi ban nhap nam sinh (dd/MM/yy) : ");
        String ns = new Scanner(System.in).nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        try {
            Date birthday = sdf.parse(ns);
            // doi ngay thang nam:
            cal.setTime(birthday);
            int yearNs = cal.get(Calendar.YEAR);

            int tuoi = yearNow - yearNs;
            System.out.println("ban " + tuoi + " tuoi");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
