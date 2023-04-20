package com.hainiu.test;

public class Demo06 {
    /*1、故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
    在他的一部著作中提出了一个有趣的问题：
    假设一对刚出生的小兔一个月后就能长成大兔，
    再过一个月就能生下一对小兔，
    并且此后每个月都生一对小兔，
    一年内没有发生死亡。
    问：一对刚出生的兔子，一年内繁殖成多少对兔子?*/
// 1    2   3   4   5   6   7   8
// 1    1   2   3   5   8   13  21
    public static void main(String[] args) {
        int month = 12;
        int[] arr = new int[month];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-2]+ arr[i-1];
        }

        System.out.println("一年内繁衍了:"+arr[arr.length -1]+"对");
    }
}
