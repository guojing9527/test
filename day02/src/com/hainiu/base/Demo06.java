package com.hainiu.base;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        //定义三个变量
        int h1 = 189;
        int h2 = 169;
        int h3 = 195;
        //再做比较
        int temp = h1 > h2 ? h1 : h2;
        int max = temp > h3 ? temp : h3;
        //输出最终结果
        System.out.println(max);
        System.out.println("------");
        int[] arr1 = {1,3,5,6};
        int[] arr2 = {4,6,9,6};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            arr3[i] = num;

        }
        for (int i = 0; i < arr2.length; i++) {
            int num = arr2[i];
            arr3[i + arr1.length] = num;

        }
        System.out.println(Arrays.toString(arr3));
        if (arr3.length % 2 == 0 ){
            System.out.println(arr3[arr3.length/2]);
            System.out.println(arr3[(arr3.length/2) - 1]);
        }else {
            System.out.println(arr3[arr3.length/2]);
        }
    }
}
