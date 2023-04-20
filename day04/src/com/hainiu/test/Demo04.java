package com.hainiu.test;

public class Demo04 {
    //    4、定义方法实现，数组的反转，要在原数组上完成
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6};
    getFan(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void getFan(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
