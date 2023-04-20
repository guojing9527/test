package com.hainiu.newtest;

public class Demo06 {
    public static void main(String[] args) {
//        6、循环的嵌套 九九乘法表
        // 两个循环嵌套
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i  + "=" + j*i +"\t");
            }
            System.out.println();
        }
    }
}
