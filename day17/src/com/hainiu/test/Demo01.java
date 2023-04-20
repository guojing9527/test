package com.hainiu.test;

public class Demo01 {
    /*一、某地有一个乞丐姓洪，去天桥要钱
            第一天要了1块钱
    第二天要了2块钱
            第三天要了4块钱
    第四天要了8块钱
            以此类推
    问题： 洪乞丐干10天，收入是多少？*/
    public static void main(String[] args) {
        // 每一天的钱
        int dayMoney = 1;
        // 总的钱
        int totalMoney = 0;
        //十天
        for (int i = 0; i < 10; i++) {
            totalMoney += dayMoney;
            dayMoney = dayMoney * 2;
        }
        System.out.println(totalMoney);
    }
}
