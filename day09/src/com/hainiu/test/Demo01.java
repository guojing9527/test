package com.hainiu.test;

import java.util.Scanner;

public class Demo01 {
    //    1、模拟用户登录，给出5次机会 参见stringdemo Demo02
    public static void main(String[] args) {
        String account = "aaa";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入你的账号：");
            String z = sc.nextLine();
            System.out.println("请输入你的密码：");
            String m = sc.nextLine();
            if (account.equals(z) && password.equals(m)){
                System.out.println("欢迎");
                break;
            }else {
                System.out.println("输入有误，你还有"+(5-i)+"次机会");
            }
        }

    }
}
