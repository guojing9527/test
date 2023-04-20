package com.hainiu.yuxi;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //请打出杨辉三角
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入五角星的行号");
        int sum = sc.nextInt();
        for (int i = 1; i <= sum; i++) {
            System.out.println();
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print( "*");
            }
            System.out.println();

        }
    }
}
