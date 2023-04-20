package com.hainiu.zouce;

import java.math.BigDecimal;

public class Demo03 {
    public static void main(String[] args) {
        double high = 100;
        double side = 0;
        for (int i = 0; i < 10; i++) {
            side += high;
            high /= 2;
            side += high;
        }

        System.out.println("高度为：" + high);
        System.out.println("总里程为：" + side);
        BigDecimal s1 = new BigDecimal("100");
        BigDecimal s2 = new BigDecimal("2");
        double v = 0;
        double v2 = 0;
        for (int i = 0; i < 10; i++) {
            BigDecimal divide = s1.divide(s2);
            s1 = divide;
             v = divide.doubleValue();
             v2 += v;
        }
        v2 += 100;
        System.out.println("高度为：" +v );
        System.out.println("总里程为：" +v2 );
    }
}
