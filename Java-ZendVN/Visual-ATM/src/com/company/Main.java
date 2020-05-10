package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int money = 0;
        DecimalFormat formatter = new DecimalFormat("#,###");

        final int five_hundred_thousand = 500000;
        final int two_hundred_thousand = 200000;
        final int one_hundred_thousand = 100000;
        final int fifty_thousand = 50000;
        final int twenty_thousand = 20000;
        final int ten_thousand = 10000;

        int fiveHundredThousand = 0;
        int twoHundredThousand = 0;
        int oneHundredThousand = 0;
        int fiftyThousand = 0;
        int twentyThousand = 0;
        int tenThousand = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Your money : ");
            money = sc.nextInt();
        }while (money % 10000 != 0);
        sc.close();

        // 500000
        if(money >= five_hundred_thousand){
            fiveHundredThousand = money/five_hundred_thousand;
            money = money % five_hundred_thousand;
            System.out.println("so to tien menh gia " + formatter.format(500000) + " la " + fiveHundredThousand);
        }

        // 200000
        if(money >= two_hundred_thousand){
            twoHundredThousand = money/two_hundred_thousand;
            money = money % two_hundred_thousand;
            System.out.println("so to tien menh gia " + formatter.format(200000) + " la " + twoHundredThousand);
        }

        // 100000
        if(money >= one_hundred_thousand){
            oneHundredThousand = money / one_hundred_thousand;
            money = money % one_hundred_thousand;
            System.out.println("so to tien menh gia " + formatter.format(100000) + " la " + oneHundredThousand);
        }

        // 50000
        if(money >= fifty_thousand){
            fiftyThousand = money / fifty_thousand;
            money = money % fifty_thousand;
            System.out.println("so to tien menh gia " + formatter.format(50000) + " la " + fiftyThousand);
        }

        // 20000
        if(money >= twenty_thousand){
            twentyThousand = money / twenty_thousand;
            money = money % twenty_thousand;
            System.out.println("so to tien menh gia " + formatter.format(20000) + " la " + twentyThousand);
        }

        // 10000
        if(money >= ten_thousand){
            tenThousand = money / ten_thousand;
            money = money % ten_thousand;
            System.out.println("so to tien menh gia " + formatter.format(10000) + " la " + tenThousand);
        }

        System.out.println(money);
    }
}
