package com.bluebegin.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo3 {
    static final double PI = 3.14159265358979323;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        scanner.close();
        DecimalFormat dFormat = new DecimalFormat("#.0000000");
        System.out.println(dFormat.format(Math.pow(r, 2)*PI));
    }
}