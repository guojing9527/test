package com.hainiu.test;

import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        /*在数学中，素数也称为质数，是指在大于1的自然数中，
        除了1和它本身以外不再有其他因子的自然数。请编写程序实现对输入的一个整数，判断是否是素数。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int i = sc.nextInt();
        if (i < 2) {
            System.out.println("不是素数");
        }
        if (i == 2) {
            System.out.println(i + "是素数");
        }
        double sqrt = Math.sqrt(i);
        for (int j = 2; j < sqrt; j++) {
            if (i % j == 0) {
                System.out.println("不是素数");
                return;
            }
        }
        System.out.println("是素数");


    }

}

