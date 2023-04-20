package com.hainiu.test;

public class Demo02 {
    /*2. 小牛想点一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，优惠价16元，油炸花生米单点8元，米饭单点3元，订单满30元8折优惠。
    但是优惠价格和折扣不能同时使用。那么请问小牛要点这三样东西，最少要花多少钱？*/
    //定义三个变量
    public static void main(String[] args) {
        //优惠价
        double y = 16 + 8 + 3;
        //折扣价
        double z = (24 + 8 + 3) * 0.8;
        //最小花的钱数
        double min = y < z ? y : z;
        System.out.println(min);
    }

}
