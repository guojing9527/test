package com.hainiu.newlx;

public class Demo03 {
    //    3、普通查找
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int index = getIndex(arr, 11);
        System.out.println(index);
    }
    public static  int getIndex(int[] arr , int key){
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
