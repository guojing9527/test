package com.hainiu.newtest;

public class Demo10 {
    public static void main(String[] args) {
        /*10、20元，买可乐，3元一瓶，一个空瓶子能退1元，请问能买多少瓶？？ 不允许赊账。
        编程语言描述数学场景。*/
        //3元一瓶，一个空瓶子能退1元 可以理解为两元一瓶 ，因为不允许赊账 所以钱要大于两块；
        //定义变量
        int temp = 2;
        int count = 0;
        int money = 20;
        while (money > 2){
           money -= temp;
           count++;
        }
        System.out.println(count);
    }
}
