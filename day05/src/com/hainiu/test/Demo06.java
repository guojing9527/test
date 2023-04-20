package com.hainiu.test;

public class Demo06 {
    public static void main(String[] args) {
        int sl = sl(12);
        System.out.println(sl);
    }

    //    斐波那契数列 不死神兔
    public static int sl(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return sl(n - 1) + sl(n - 2);
    }
}
