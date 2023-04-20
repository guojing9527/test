package com.hainiu.newxl;

import java.math.BigDecimal;

public class Demo13 {
    public static void main(String[] args) {
//        10、利用BigDecimal完成小数的精确运算
        BigDecimal b1 = new BigDecimal("1.1");
        BigDecimal b2 = new BigDecimal("0.8");
        BigDecimal add = b1.add(b2);
        double v = add.doubleValue();
        System.out.println(v);
    }
}
