package com.hainiu.newxl;

public class Demo01 {
    //    2、键盘录入一个字符串 统计其中的英文字母有多少个？
    public static void main(String[] args) {
    String str = "asfdsagsah12345678@#$#@%@%sadfghj";
    int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a'&& str.charAt(i)<='z')||(str.charAt(i) >= 'A'&& str.charAt(i)<='Z')){
                count++;
            }
        }
        System.out.println(count);
    }
}
