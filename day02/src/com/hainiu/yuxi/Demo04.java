package com.hainiu.yuxi;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
       /* 现在给出两个数组：

·数组a：{1，7，9，11，13，15，17，19}；

·数组b：{2，4，6，8，10}

        两个数组合并为数组c，按升序排列。*/
        int[] a = {1,7,9,11,13,15,17,19};
        int[] b = {2,4,6,8,10};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            c[i] = temp;
        }
        for (int i = 0; i < b.length; i++) {
            int temp = b[i];
            c[i + a.length] = temp;
        }
        //按照升序的方式排序
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
