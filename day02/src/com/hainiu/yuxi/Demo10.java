package com.hainiu.yuxi;

import java.awt.*;
import java.util.Scanner;

public class Demo10 {
     static String [] name = {"小米","华为","苹果","荣耀"};
    static double[] price = {6998,5999,10888,3999};
    static int[] numbers = {20, 50, 89, 99};

    public static void main(String[] args) {
        /*
        *------------
        * 1.商品列表
        * 2.商品录入
        * 3.商品查询
        * 4.统计信息
        * 5.退出
        *-------------
        *选择： > 1
        * */
//        死循环显示菜单
        outer:
        while (true){
//            显示菜单，并获取其选择的值
            int c = menu();
            switch (c) {
                case 1 : f1();break;
                case 2 : f2();break;
                case 3 : f3();break;
                case 4 : f4();break;
                case 5 : break outer;

            }
        }
    }

    public static  int menu(){
        System.out.println("-----------");
        System.out.println("1.商品列表");
        System.out.println("2.商品录入");
        System.out.println("3.商品查询");
        System.out.println("4.统计信息");
        System.out.println("5.退出");
        System.out.println("-----------");
        System.out.println("选择： > 1");
        return new Scanner(System.in).nextInt();
    }
    private static void f1(){
        for (int i = 0; i < name.length; i++) {
            String s = name[i];
            double v = price[i];
            int n = numbers[i];
            System.out.println((i+1) + "，名称：" +s+"，价格："+v+"，数量："+n );

        }
    }
    private static void f2(){
        for (int i = 0; i < name.length; i++) {
            System.out.println("录入第"+(i+1)+"件商品：");
            System.out.print("名称：");
            String s = new Scanner(System.in).nextLine();
            System.out.print("价格：");
            double v = new Scanner(System.in).nextDouble();
            System.out.print("数量：");
            int x = new Scanner(System.in).nextInt();
            name[i] = s;
            price[i] = v;
            numbers[i] = x;
        }
//        重新展示商品
        f1();
    }
    private static void f3(){
        System.out.print("请输入查询的商品名：");
        String s = new Scanner(System.in).nextLine();
        for (int i = 0; i < name.length; i++) {
            if (s.equals(name[i])){
                String n = name[i];
                double v = price[i];
                int x = numbers[i];
                System.out.println((i+1) + "，名称：" +s+"，价格："+v+"，数量："+n );
                return;
            }
        }
        System.out.println("找不到商品了");
    }
    private static void f4(){
        double spzj = 0;//商品总价
        double djzj = 0;//单价总价
        double zgdj = 0;//最高单价
        double zgzj = 0;//最高总价
        for (int i = 0; i < name.length; i++) {
            spzj += price[i] * numbers[i];
            djzj += price[i] ;
            if (price[i] > zgdj){
                zgdj = price[i];
            }
            if (price[i] * numbers[i] > zgzj){
                zgzj = price[i] * numbers[i];
            }
        }
        System.out.println("商品总价"+ spzj);
        System.out.println("单价均价"+(djzj / name.length));
        System.out.println("最高单价"+zgdj);
        System.out.println("最高总价"+zgzj);
    }
}
