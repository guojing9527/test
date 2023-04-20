package com.hainiu.newxl;

import java.util.Scanner;

public class Demo02 {
    //    3、模拟用户登录
    public static void main(String[] args) {
        String zh = "kdy";
        String mm = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入账号：");
            String s1 = sc.nextLine();
            System.out.println("请输入密码：");
            String s2 = sc.nextLine();
            if (s1.equals(zh) && s2.equals(mm)) {
                System.out.println("欢迎");
                break;
            } else {
                System.out.println("账号密码有误，请重新输入你还有" + (4 - i) + "次机会");
            }

        }
    }
}
