package com.hainiu.tset;

public class Demo04 {
    public static void main(String[] args) {
        useAdd(new Add() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });
        useAdd((int x, int y)->{
            return x + y;
        });
    }

    public static void useAdd(Add a) {
        int num = a.add(10, 20);
        System.out.println(num);
    }
}
