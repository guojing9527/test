package com.hainiu.fuxi;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,6,5,7,9,8};
        xz(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void xz (int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            if (index != i){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
