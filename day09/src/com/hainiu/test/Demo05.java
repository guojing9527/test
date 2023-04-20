package com.hainiu.test;

import java.util.Scanner;

public class Demo05 {
    //    5、判断回文字符串 stringbuilderdemo  Demo04
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            boolean hw = hw(str);
            System.out.println(hw);
        }

    }
    public static boolean hw(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String s = sb.toString();
        return str.equals(s);
    }
}
