package com.hainiu.test;

import java.util.Random;
import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
//        由系统随机生成一个1-100之间的随机数，猜数字。
        Random rad = new Random();
        int i = rad.nextInt(100) +1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你猜的数字");
        while (true){
            int w = sc.nextInt();
            if (w < i ){
                System.out.println("你猜小了");
            }else if (w > i ){
                System.out.println("你猜大了");
            }else {
                System.out.println("恭喜猜中了");
                break;
            }
        }
    }
}
