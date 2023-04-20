package com.hainiu.test;

public class Demo06 {
    public static void main(String[] args) {
        /*一张纸的厚度为0.2毫米，世界上最高的山峰珠穆朗玛峰的高度为8848米，
        在理论情况下，请问这张纸折叠多少次可以超过珠峰的高度？*/
        double zf = 8848000;
        double paper = 0.2;
        int count = 0;
        while (paper <= zf){
            paper *= 2;
            count++;
        }
        System.out.println(count);
    }
}
