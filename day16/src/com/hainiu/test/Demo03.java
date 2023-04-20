package com.hainiu.test;

public class Demo03 {
    public static void main(String[] args) {
//        迷宫
        int mg = mg(0, 0);
        System.out.println(mg);
    }

    public static int mg(int a, int b) {
        if (a == 4 || b == 4) {
            return 1;
        }
        return mg(a + 1, b) + mg(a, b + 1);
    }
}
