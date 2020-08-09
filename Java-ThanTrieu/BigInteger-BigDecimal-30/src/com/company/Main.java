package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // BigInteger
//        BigInteger a = new BigInteger("120");
//        BigInteger b = new BigInteger("5");
//        BigInteger d = a.divide(b);
//        System.out.println(d);
//        BigInteger c = new BigInteger("100",6);

        // BigDecimal
        BigDecimal a = new BigDecimal("493.39293283823823");
        BigDecimal b = new BigDecimal("29349.2323223323232");
        BigDecimal c = a.subtract(b);
        System.out.println(c);



    }
}
