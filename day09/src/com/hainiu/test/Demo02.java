package com.hainiu.test;

import java.util.Scanner;

public class Demo02 {
    //    2、将键盘录入的电话号码中间四位隐藏， 参见stringdemo Demo05
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入11位手机号码");
        String phone = sc.nextLine();
        String s1 = phone.substring(0, 3);
        String s2 = phone.substring(7);
        String s = s1.concat("****").concat(s2);
        System.out.println(s);
    }
}
