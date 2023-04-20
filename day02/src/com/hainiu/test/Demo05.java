package com.hainiu.test;

import java.util.Scanner;

public class Demo05 {
   /* 动物园里新来了三只老虎，他们的体重由键盘录入（单位kg，仅录入数值即可），请用程序实现获取这三只老虎的最小体重。*/
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入第一只老虎的体重：");
       int weight1 = sc.nextInt();
       System.out.println("请输入第二只老虎的体重：");
       int weight2 = sc.nextInt();
       System.out.println("请输入第三只老虎的体重：");
       int weight3 = sc.nextInt();
       int temp  = weight1 < weight2 ? weight1 : weight2;
       int min = temp < weight3 ? temp : weight3;
       System.out.println(min);
   }
}
