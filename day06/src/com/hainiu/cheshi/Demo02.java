package com.hainiu.cheshi;

import java.util.Arrays;

public class Demo02 {
    /*4、现有如下两个数组，元素如下：
    数组a：{11, 33, 55, 77}
    数组b：{22, 44, 66, 88}
    请编写程序，将两个数组合并为一个数组c；要求包含a、b数组的所有元素即可，无需排序。
    即结果为：{11, 33, 55, 77, 22, 44, 66, 88}*/
    public static void main(String[] args) {
        int[] a = {11, 33, 55, 77};
        int[] b = {22, 44, 66, 88};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        int temp = 0;
        for (int i = a.length ; i < c.length ; i++) {
            c[i] = b [temp];
            temp++;
         }
        System.out.println(Arrays.toString(c));
    }
}
