package com.hainiu.test;

public class Demo03 {
    //    3、冒泡排序
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 3, 6, 8, 4, 9, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i ; j < arr.length -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
