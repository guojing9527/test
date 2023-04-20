package com.hainiu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("hello ");
        System.out.println("world");
        //创建一个数组a
        int[] a = {1,2,4};
        //创建一个数组b
        int[] b = {3,5,6,8};
        //创建一个数组c长度是a和b的和
        int[] c = new int[a.length + b.length];
        //第一次循环把a的值全部赋予c
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            c[i] = num;
        }
        //第二次循环把b的值全部赋予c数组
        for (int i = 0; i < b.length; i++) {
            int num = b[i];
            c[i + a.length] = num;
        }
        /* 把c数组在虚拟机中展现出来
        方法一
        System.out.println(Arrays.toString(c));
        方法二
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        */
        //分割线
        //System.out.println("-----------");
        //判断除于二是否能出尽
        if (c.length % 2 == 0){
            System.out.println("有两个结果");
            int x = c[(c.length/2)-1];
            System.out.println(x);
            int y = c[c.length/2];
            System.out.println(y);
        }else{
            int z = c[c.length/2];
            System.out.println(z);
        }
        //猜字小游戏
        //产生随机数
        Random rand = new Random();
        int rand1 = rand.nextInt(100);
        //输入随机数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        //判断所猜数与自己所书写数的大小
        while (true){
            int num = sc.nextInt();
            if (num > rand1){
                System.out.println("猜大了");
            }else if (num < rand1){
                System.out.println("猜小了");
            }else {
                System.out.println("恭喜猜中了");
                break;
            }
        }

    }
}
