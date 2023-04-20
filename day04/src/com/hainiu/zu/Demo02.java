package com.hainiu.zu;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = {1,2,3,4,2,4,15,2};
        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
    }
}
