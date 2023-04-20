package com.hainiu.newtest;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        /*2、对输入的成绩作出判断 属于哪个等级*/
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        // 获取成绩
        int i = sc.nextInt();
        //规定范围
        if (i >= 0 && i <= 100){
            //进行判断
            if (i >= 90){
                System.out.println("A");
            }else if (i >= 80){
                System.out.println("B");
            }else if (i >= 60){
                System.out.println("C");
            }else {
                System.out.println("不及格");
            }
        }else {
            System.out.println("成绩输入有误");
        }
    }
}
