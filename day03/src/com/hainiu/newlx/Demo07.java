package com.hainiu.newlx;

public class Demo07 {
    /* 7、故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
     在他的一部著作中提出了一个有趣的问题：
     假设一对刚出生的小兔一个月后就能长成大兔，
     再过一个月就能生下一对小兔，
     并且此后每个月都生一对小兔，
     一年内没有发生死亡。
     问：一对刚出生的兔子，一年内繁殖成多少对兔子?*/
    public static void main(String[] args) {
        int tz = getTZ(12);
        System.out.println(tz);

    }

    public static int getTZ(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return getTZ(n - 2) + getTZ(n - 1);
    }
}
