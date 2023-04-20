package com.hainiu.test;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        /*4. 某客服系统有服务满意度反馈系统，
        输入数字1、2、3、4分别表示非常满意、基本满意、不太满意、非常不满意；请使用程序实现该效果。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入服务满意度反馈（1，2，3，4）：");
        int i = sc.nextInt();
        switch (i){
            case 1:
                System.out.println("非常满意");
                break;
            case 2:
                System.out.println("基本满意");
                break;
            case 3:
                System.out.println("不太满意");
                break;
            case 4:
                System.out.println("非常不满意");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
