package com.hainiu.tset;

import java.util.Scanner;

public class Demo01 {
    //    2、键盘录入文本，统计英文字母都多少个
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("文本");
        String s = sc.nextLine();
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ){
                count++;
            }
        }
        System.out.println(count);
    }
}
