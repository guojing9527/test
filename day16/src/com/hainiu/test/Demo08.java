package com.hainiu.test;

import java.util.Arrays;

public class Demo08 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 6, 7, 1, 9, 8};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
