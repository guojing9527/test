package com.hainiu.ke;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        /*键盘录入两个整数，并计算它们的差值，要求返回差值为非负数。
        例如，两个整数10和20，不管先录入哪个得到的差值都是10。运行效果如下：*/
        Scanner sc = new Scanner(System.in);
        System.out.println("录入第一个整数：");
        int i1 = sc.nextInt();
        System.out.println("录入第二个整数：");
        int i2 = sc.nextInt();
        int i3 = i1 -i2;
        if (i1 - i2 < 0 ){
            i3 = -i3;
            System.out.println(i3);
        }else {
            System.out.println(i3);
        }
    }
}
