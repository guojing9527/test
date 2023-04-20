package com.hainiu.test;

public class Demo04 {
    //    4、选择排序
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 3, 6, 8, 4, 9, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index != i){
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
