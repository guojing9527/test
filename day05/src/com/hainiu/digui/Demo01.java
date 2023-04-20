package com.hainiu.digui;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(cj(5));
    }
    public static int cj(int n) {
        if (n == 1) {
            return 1;
        }
        return cj(n - 1) * n;
    }
}
