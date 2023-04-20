package com.hainiu.test;

public class Demo01 {
    public static void main(String[] args) {
//        斐波那契
        int fb = fb(12);
        System.out.println(fb);
    }

    public static int fb(int n) {
        if (n == 1 || n == 2){
            return 1;
        }
        return  fb(n - 1) +fb(n - 2);
    }
}
