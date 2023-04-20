package com.hainiu.test;

import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 7, 9, 10};
        int[] arr2 = {2, 4, 6, 6};
        int[] arr = new int[arr1.length + arr2.length];

        int index1 = 0;
        int index2 = 0;
        int index = 0;

// 两个数组的元素都没拷贝完毕
        while (index1 < arr1.length && index2 < arr2.length) {
            if (arr1[index1] <= arr2[index2]) {
                arr[index++] = arr1[index1++];
            } else {
                arr[index++] = arr2[index2++];
            }
        }
        while (index1 < arr1.length) {
            arr[index++] = arr1[index1++];
        }
        while (index2 < arr2.length) {
            arr[index++] = arr2[index2++];
        }

        System.out.println(Arrays.toString(arr));
    }
}
