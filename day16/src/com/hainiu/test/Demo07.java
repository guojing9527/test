package com.hainiu.test;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,6,7,1,9,8};
        xz(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void xz(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j] < arr[index]){
                   index = j;
                }
            }
            if (index != i){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
}
