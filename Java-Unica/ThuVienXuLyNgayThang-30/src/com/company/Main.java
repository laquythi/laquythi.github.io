package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// lop Calendar

//        Calendar cal = Calendar.getInstance();
//        System.out.println(cal.getTime()); // equal Wed Aug 19 14:20:05 ICT 2020
//        int year = cal.get(Calendar.YEAR);
//        System.out.println(year); // equal 2020
//        int month = cal.get(Calendar.MONTH);
//        System.out.println(month + 1); // equal 8 because month run from 0 - 11
//        int day = cal.get(Calendar.DATE);
//        System.out.println(day);

//        Date time = cal.getTime();
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // MM is required
//        System.out.println(sdf.format(time)); // equal 19/08/2020

//        Date time = cal.getTime();
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm:ss aaa");
//        System.out.println(sdf.format(time)); // equal 19/08/20 02:57:23 PM

        // chuyen chuoi nhap vao sang dinh dang ngay thang nam sinh
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
