package com.hainiu.fuxi;

public class Demo02 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,6,5,7,9,8};
        mp(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void mp (int[]arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
