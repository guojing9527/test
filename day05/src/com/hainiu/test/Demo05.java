package com.hainiu.test;

public class Demo05 {
    public static void main(String[] args) {
        int jc = jc(5);
        System.out.println(jc);
    }
//    阶乘
    public static int jc (int n){
        if(n == 1){
            return 1;
        }
        return jc(n-1)*n;
    }
}
