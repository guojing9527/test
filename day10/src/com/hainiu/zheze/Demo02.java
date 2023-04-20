package com.hainiu.zheze;

public class Demo02 {
    public static void main(String[] args) {
        String s = "w..w...w...y...y..y..y...xx..x.x..xb..b..b.bc..c.c.c.c";
        String s1 = s.replaceAll("\\.","");
        System.out.println(s1);
        String s2 = s1.replaceAll("(.)\\1+", "$1");
        System.out.println(s2);
    }
}
