package com.company;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// test dinh dang so
//        DecimalFormat dc = new DecimalFormat("#.##");
//        double x = 10/3.0;
//        System.out.println(x); // equal 3.3333333335
//        System.out.println(dc.format(x)); // equal 3.33

        // test dinh dang symbol
//        int x = 248382734;
//        DecimalFormat df = new DecimalFormat("#,##");
//        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
//        df.setDecimalFormatSymbols(dfs);
//        System.out.println(df.format(x));

//        int x = 151789987;
//        DecimalFormat df = new DecimalFormat("#,###");
//        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
//        df.setDecimalFormatSymbols(dfs);
//        System.out.println(df.format(x)); // equal 151,789,987

        int x = 366921214;
        DecimalFormat df = new DecimalFormat("#,###");
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
//        dfs.setGroupingSeparator('.');
        df.setDecimalFormatSymbols(dfs);
        System.out.println(df.format(x));
    }
}
