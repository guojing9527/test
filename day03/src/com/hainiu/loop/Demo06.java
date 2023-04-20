package com.hainiu.loop;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        //请打出杨辉三角
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入五角星的行号");
        int sum = sc.nextInt();
        for (int i = 1; i <= sum; i++) {
            for (int k = 1; k <= sum-i; k++) {
                System.out.print(" ");
            }
            for (int g = 1; g < i; g++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print( "*");
            }
            System.out.println();

        }
    }
}
