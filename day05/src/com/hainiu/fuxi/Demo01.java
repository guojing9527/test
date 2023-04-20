package com.hainiu.fuxi;

public class Demo01 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9};
        int binary = binary(arr, 3);
        System.out.println(binary);
    }
    //二分查找
    public static int binary(int[]arr,int key){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
           int  mid = (start + end) / 2;
            if ( key < arr[mid]){
                end = mid -1;
            }else if (key > arr[mid]){
                start = start +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}