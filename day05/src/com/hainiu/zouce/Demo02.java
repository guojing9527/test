package com.hainiu.zouce;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();
        int code = 0;
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isCode(c)) {
                code++;
            }
            if (isNumber(c)) {
                number++;
            }
        }
        System.out.println("英文字符有：" + code + "个");
        System.out.println("数字字符有：" + number + "个");

    }

    public static boolean isCode(char c) {
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    public static boolean isNumber(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }
}
