package com.hainiu.test;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,6,7,1,9};
        mp(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mp(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
