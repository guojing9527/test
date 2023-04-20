package com.hainiu.newlx;

public class Demo10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 13;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                System.out.println(mid);
                break;
            }
        }
        if (key > arr[end] || key < arr[start]) {
            System.out.println("-1");
        }
    }
}