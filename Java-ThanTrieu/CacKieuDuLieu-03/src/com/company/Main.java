package com.company;

public class Main {

    public static void main(String[] args) {
	// cac kieu du lieu trong Java
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s",
                Integer.TYPE, Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE
                );
        System.out.println("");

        // Short
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s",
                Short.TYPE, Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.println();

        // Long
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s",
                Long.TYPE, Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    };
