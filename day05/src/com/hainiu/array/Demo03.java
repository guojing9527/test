package com.hainiu.array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr ={1,5,2,6,8,7,3,3};
        bobbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    public static void bobbleSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
