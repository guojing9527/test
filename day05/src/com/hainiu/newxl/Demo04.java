package com.hainiu.newxl;

import java.util.Arrays;
import java.util.Random;

public class Demo04 {
   /* 5、生成验证码  四位的字符串  可选字符包含：大写字母小写字母数字
            通过索引操作数据*/
   public static void main(String[] args) {
       String s = "";
       StringBuilder sb = new StringBuilder();
       for (char i = 'a'; i < 'z'; i++) {
           sb.append(i);
       }
       for (char i = 'A'; i < 'Z'; i++) {
           sb.append(i);
       }
       for (char i = '0'; i < '9'; i++) {
           sb.append(i);
       }
       Random r = new Random();
       for (int i = 0; i < 4; i++) {
           int j = r.nextInt(sb.length());
           s += sb.charAt(j);
       }
       System.out.println(s);
   }
}
