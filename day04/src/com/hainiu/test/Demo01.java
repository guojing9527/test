package com.hainiu.test;

public class Demo01 {
    //    1、定义方法实现在数组中查找某个元素第一次出现的索引位置，如果不存在返回-1
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,7};
        int num = getNum(arr, 9);
        System.out.println(num);
    }
    public static int getNum(int[] arr,int y) {
        int x = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == y) {
                x = i;
                break;
            }
        }
       return x;
    }
}
