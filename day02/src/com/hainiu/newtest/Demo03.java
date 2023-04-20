package com.hainiu.newtest;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Demo03 {
    public static void main(String[] args) {
//        3、水仙花数案例
        //计数器
        int count = 0;
        //循环
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100  % 10;
           // Math.pow(ge,3) Math.pow(shi,3) Math.pow(bai,3)
            //判断是否为水仙花数
            if (ge *ge*ge + shi*shi*shi+bai*bai*bai == i){
                System.out.println(i);
                count++;
            }
        }
        //输出结果
        System.out.println(count);
    }
}
