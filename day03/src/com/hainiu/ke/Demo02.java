package com.hainiu.ke;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        /*请输入一个三位数的正整数，计算这个数每一位上的数字之和。
        例如：输入345，每一位上的数字相加3+4+5=12，输出结果12。运行效果如下：*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数的正整数:");
        int i = sc.nextInt();
       int a  = i % 10;
       int b = i /10 %10;
       int c = i /100 ;
      int num = a +b +c;
        System.out.println(num);

    }
}
