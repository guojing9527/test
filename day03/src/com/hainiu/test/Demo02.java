package com.hainiu.test;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
//   2. 键盘录入一个成绩，判断这个成绩的等级。90~100 A；80~89 B；60~79 C；0~59 D
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int i = sc.nextInt();
        if (i >= 0 && i <=59){
            System.out.println("成绩为：D");
        }else if (i >= 60 && i <=79){
            System.out.println("成绩为：C");
        }else if (i >= 80 && i <=89){
            System.out.println("成绩为：B");
        }else if (i >= 90 && i <=100){
            System.out.println("成绩为：A");
        }else {
            System.out.println("成绩输入有误");
        }
    }
}
