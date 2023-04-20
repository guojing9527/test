package com.hainiu.base;

public class Demo04 {
    public static void main(String[] args) {
        //++在后，在后运算，++在前，在前运算。（在任何运算过程中）
        int x = 10;
        int y =x++ + x++;
        System.out.println(y);
        System.out.println(x);

    }
}
