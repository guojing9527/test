package com.hainiu.test;

public class Demo03 {
    /*小牛同学想买一个价值8888元的新手机，他的旧手机在二手市场能卖1880元，
    而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打7.5折优惠。为了更省钱，小牛要不要以旧换新？*/
    //定义三个变量
    public static void main(String[] args) {
        //把旧手机卖掉
        double n = 8888 - 1880;
        //以旧换新
        double x = 8888 * 0.75;
        //判断要不要以旧换新
        String s = x < n ? "要以旧换新" : "不要以旧换新";
        System.out.println(s);
    }

}
