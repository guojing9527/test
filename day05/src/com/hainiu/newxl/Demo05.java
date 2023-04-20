package com.hainiu.newxl;

public class Demo05 {
//    6、判断一个字符串是否是回文

    public static void main(String[] args) {
        String str = "12321";
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        System.out.println(str.equals(reverse.toString()));
    }
}
