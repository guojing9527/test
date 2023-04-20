package com.hainiu.array;

public class Demo02 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,9,10,13};
        int key =3;
        int i = binarySearch(arr,key);
        System.out.println(i);

    }
    public static int binarySearch (int[]arr,int key){
        int start = 0;
        int end  = arr.length-1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (key < arr[mid]){
                end = mid -1;
            }else if (key > arr[mid]){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}