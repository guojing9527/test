package com.hainiu.ifdemo;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入成绩：");
        int i = sc.nextInt();
        if (i >= 0 && i <= 59){
            System.out.println("吃小朋友最爱吃的大嘴巴子");
        } else if (i >= 60 && i <= 69){
            System.out.println("加油吧！小伙");
        }else if (i >= 70 && i <= 89){
            System.out.println("吃大餐");
        }else if (i >= 90 && i <= 100){
            System.out.println("周末自由");
        }else {
            System.out.println("成绩录入有误");

        }
    }
}
