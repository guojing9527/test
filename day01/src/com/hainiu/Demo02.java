package com.hainiu;

public class Demo02 {
    public static void main(String[] args) {
        //九九乘法表
        //行
        for (int i = 1; i <= 9; i++) {
        //列
            for (int j = 1; j <= i; j++) {
                //拼接
                System.out.print(j + "*" + i + "=" + (i*j) + " " );
            }
            System.out.println();
        }
        /*小牛买了一个存钱罐，
        他计划这样存钱，第一周存10，第一周存20，第一周存30，每周依次递加
        请计算小牛一年存多少钱(一年52周)
        */
        int allMoney = 0;
        int weekMoney = 10;
        for (int i = 1; i <= 52; i++) {
            allMoney += weekMoney;
            weekMoney += 10;
        }
        System.out.println(allMoney);
        /*
        熊怪吃核桃，熊怪有一个习惯每次总是吃一半，留一半，如果不能等分就丢一个
        熊怪一共有1543个核桃他在吃核桃的过程中要丢掉多少核桃
         */
        //总核桃数
        int total = 1543;
        //扔掉的核桃数
        int count = 0;
        while (total > 0 ){
            //判断是否能除尽
            if (total % 2 == 1){
                total--;
                count++;
            }
            total /= 2;
        }
        System.out.println(count);
        /*
        有一个容量为10L的水桶
        水桶上面开始注水，同时下面开始出水
        第一分钟注水速度为1L/分钟，第二分钟注水速度为2L/分钟，第3分钟注水速度为3L/分钟，以此类推
        出水速度持续在3L/分钟，问几分钟之后水桶能加满谁
         */
        //水桶的总量 size
        int size = 0;
        //注入的水量
        int ru = 1;
        //流出的水量
        int chu = 3;
        //所需要的时间
        int sj = 0;
        //判断是否注满水
        while (size < 10 ){
            size = size + ru - chu;
            //注水量不能小于零
            if (size < 0){
                size = 0;
            }
            ru++;
            sj++;
        }
        System.out.println(sj);
    }
}
