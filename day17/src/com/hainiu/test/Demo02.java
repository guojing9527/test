package com.hainiu.test;

import java.util.Arrays;
import java.util.Random;

public class Demo02 {
    /*二、体彩中有一项是双色球，要求在1-33号共33个红色球里选出6个，
            1-16号共16个蓝色球中选出一个作为中奖号码，
    打印结果如下图所示，请实现这个需求。*/
    public static void main(String[] args) {
        for (int i = 1; i < 34; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //红球
        int[] arr = new int[6];
        Random r1 = new Random();
        for (int i = 0; i < 6; i++) {
            arr[i] = r1.nextInt(33) + 1;
        }
        System.out.println(Arrays.toString(arr));
        //蓝球
        Random r2 = new Random();
        int lan = r2.nextInt(16) + 1;
        System.out.println(lan);

    }
}
