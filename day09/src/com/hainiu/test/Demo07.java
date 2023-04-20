package com.hainiu.test;

import org.omg.CORBA.ARG_OUT;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo07 {
   /*7、实现浮点数的精确运算 参见 intergerdemo Demo04*/
   public static void main(String[] args) {
       BigDecimal x = new BigDecimal("1.1");
       BigDecimal y = new BigDecimal("1.8");
       BigDecimal add = x.add(y);
       double v = add.doubleValue();
       System.out.println(v);
       BigDecimal divide = x.divide(y,5, RoundingMode.HALF_UP);
       double v1 = divide.doubleValue();
       System.out.println(v1);
       BigDecimal subtract = x.subtract(y);
       double v2 = subtract.doubleValue();
       System.out.println(v2);
       BigDecimal multiply = x.multiply(y);
       double v3 = multiply.doubleValue();
       System.out.println(v3);

   }
}
