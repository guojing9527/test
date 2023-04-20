package com.hainiu.yuxi;

public class Demo09 {
    /*鸡兔同笼问题(穷举法)
        鸡兔一共35只，共有94只脚，鸡兔各有多少只？*/
    public static void main(String[] args) {
        for (int t = 0 , j = 35 ; t <= 35; t++ , j--) {
        if (t * 4 + j * 2 == 94 ){
            System.out.println("兔子有：" + t + "只" +"," + "鸡有：" + j +"只");
        }
        }
    }
}
