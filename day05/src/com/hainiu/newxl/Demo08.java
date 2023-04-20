package com.hainiu.newxl;

public class Demo08 {
    //    9、正则表达式的案例 讲义 5个代码
    public static void main(String[] args) {
        String regex = "^[a-z0-9A-Z]+[-|a-z0-9A-Z._]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$";
        String email1 = "xxxyyy@zzz.com.cn";
        String email2 = "xxx-yyy@zzz.com";
        String email3 = "xxx_yyy@zzz.cn";
        String email4 = "88888@qq.com";
        System.out.println(email1.matches(regex));
        System.out.println(email2.matches(regex));
        System.out.println(email3.matches(regex));
        System.out.println(email4.matches(regex));
    }
}
