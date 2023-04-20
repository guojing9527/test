package com.hainiu.test;

import java.util.Arrays;

public class Demo09 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 2, 3, 1, 5, 7, 8};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    public static void quickSort(int[] arr, int start, int end){
        if (start < end){
            int i = start;
            int j = end;
            int pivot = arr[i];
            while (i < j){
                while (i < j && arr[j] >= pivot){
                    j--;
                }
                while (i < j && arr[i] <= pivot){
                    i++;
                }
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            arr[start] = arr[i];
            arr[i] = pivot;
            quickSort(arr, start, i - 1);
            quickSort(arr, i + 1, end);
        }
    }
}
