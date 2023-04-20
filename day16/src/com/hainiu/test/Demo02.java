package com.hainiu.test;

public class Demo02 {
    public static void main(String[] args) {
//        汉诺塔
        int ht = ht(6);
        System.out.println(ht);
    }

    public static int ht(int n) {
        if (n == 1) {
            return 1;
        }
        return 2 * ht(n - 1) + 1;
    }
}

