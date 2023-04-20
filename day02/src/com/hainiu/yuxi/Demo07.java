package com.hainiu.yuxi;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        /*如果尾数为8，需支付办卡费50元
        如果尾数为4，需支付办卡费用0元
        如果是其他尾号,需支付办卡费用20元*/
       Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号码：");
        String s = sc.nextLine();
        getPrice(s);

    }
    public static void getPrice(String s){
        if (s.length() != 11){
            System.out.println("输入有误，请从新录入：");
        }
        char a = s.charAt(10);
        int price = 0;
        switch (a){
            case '8' : price = 50 ; break;
            case '4' : price = 0 ; break;
            default:  price = 20 ;
        }
        System.out.println("您实际应付的价格认为：" + price +"元");
    }
}
