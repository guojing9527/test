package com.hainiu.test;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
       /* 6、"12 56 34 112 23 66 11 18 35" -- 把其中的数据按照从小到大的顺序排列
        组成一个新的字符串 参见 intergerdemo Demo03
        通过这个案例掌握 字符串与整数之间的互换*/
        String sArr ="12 56 34 112 23 66 11 18 35";
        String[] s = sArr.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length-1){
                sb.append(" ");
            }
        }
        String s1 = sb.toString();
        System.out.println(s1);
    }
}
