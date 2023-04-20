package com.hainiu.array;

import java.util.Arrays;

public class Demo04 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4, 6, 2, 7, 9, 1};
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectSort(int[] arr) {
        // 外循环 要执行arr.length -1 次
        for (int i = 0; i < arr.length - 1; i++) {
            // 定义一个变量 代表索引
            int index = i;
            //外循环 先找在交换
            for (int j = i + 1; j < arr.length; j++) {
                // 找最小值的索引
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            // 在判断不相等要交换
            if (index != i) {
                // 交换
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }

}
