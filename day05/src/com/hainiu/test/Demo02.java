package com.hainiu.test;

public class Demo02 {
    //    2、二分查找
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 2;
        int start = 0;
        int end = arr.length -1;
        if (key > arr[arr.length-1] || key < arr[0]){
            System.out.println("-1");
        }
        while (start <= end){
            int mid = (start +end)/2;
            if(key < arr[mid]){
                end = mid -1;
            }else if (key > arr[mid]){
                start = mid +1;
            }else {
                System.out.println(mid);
                break;
            }
        }
    }
}
