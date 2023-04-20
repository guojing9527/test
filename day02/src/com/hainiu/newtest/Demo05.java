package com.hainiu.newtest;

import java.util.Random;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
//        5、猜数字小游戏
        //生成随机数
        Random r = new Random();
        int random = r.nextInt(100) + 1;
        //键盘录入
        Scanner sc= new Scanner(System.in);
        //循环直到找到才结束
        while (true){
            System.out.println("请输入您要才的数字：");
            int i = sc.nextInt();
            if (i < random){
                System.out.println("你猜小了");
            }else if (i > random){
                System.out.println("你猜大了");
            }else {
                System.out.println("猜对啦！");
                break;
            }
        }
    }
}
