package com.hainiu.newlx;

import java.util.Arrays;

public class Demo06 {
    /*6、定义方法实现，获取数组的一部分，
            （需要的参数是：一个数组，一个开始索引 fromIndex，一个长度 len，
    实现的目标是从该索引fromIndex位置获取，一共获取len个元素，组成一个新数组）*/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        getArray(arr,0,4);
    }
    public static void getArray(int[] arr, int formIndex, int len){
        int[] array = new int[len];
        int temp = 0;
        for (int i = formIndex; i < (formIndex + len); i++) {
            array[temp] = arr[i];
            temp++;
        }
        System.out.println(Arrays.toString(array));
    }
}
