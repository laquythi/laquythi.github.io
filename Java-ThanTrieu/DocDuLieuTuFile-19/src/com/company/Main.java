package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths
            .get("C:\\Users\\laquy\\OneDrive\\Desktop\\test.txt"),
                "utf-8");
        int inputInteger;
        while(scanner.hasNextInt()){
            inputInteger = scanner.nextInt();
            System.out.println("value " + inputInteger);
        }
        scanner.nextLine();
        String lineData = scanner.nextLine();
        System.out.println("second line data: " + lineData);
        scanner.close();
    }
}
