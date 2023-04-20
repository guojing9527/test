package com.hainiu.test;

public class ZhengZe2 {
    public static void main(String[] args) {
        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
        String regex = "1[3|4-9]\\d{9}";
        String s = str.replaceAll(regex,"****");
        System.out.println(s);
        String s1 = str.replaceFirst(regex, "****");
        System.out.println(s1);
    }
}
