package com.company;

import org.apache.commons.lang3.StringUtils;

public class Test {
    public static void main(String[] args) {
        boolean testNumber = StringUtils.isNumeric("la quy thi");
        System.out.println(testNumber); // false

        boolean testNumber2 = StringUtils.isAllEmpty("");
        System.out.println(testNumber2); // true
    }
}
