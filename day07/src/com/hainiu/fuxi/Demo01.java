package com.hainiu.fuxi;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int i = Arrays.binarySearch(arr, 4);
        System.out.println(i);
        int[] arr1 = {10,2,31,4,5,62,7,89,9};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
