package com.hainiu.test;

public class Demo08 {
    public static void main(String[] args) {
        int tj = tj(12);
        System.out.println(tj);

    }

    //    跳台阶
    public static int tj(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return tj(n - 1) + tj(n - 2);
    }
}
