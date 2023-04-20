package com.hainiu.yuxi;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        /*绝对值是指一个数在数轴上所对应点到原点的距离，用“| |”来表示。
        负数的绝对值是他去掉负号以后的值，而非负数（0和正数）的绝对值是他本身。
        请定义一个方法，接收用户输入的数字，输出绝对值结果。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        double input = sc.nextDouble();
        double absNum = getAbsNum(input);
        System.out.println(absNum);


    }
    public static double getAbsNum (double input){
        if (input >= 0){
            return input;
        }else{
            return -input;
        }

    }
}
