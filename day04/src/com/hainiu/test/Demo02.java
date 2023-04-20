package com.hainiu.test;

import java.util.Arrays;

public class Demo02 {
   /* 定义方法实现，获取数组的一部分，
    需要的参数是：一个数组，一个开始索引 off，一个长度 len，
    实现的目标是从该索引off位置获取，一共获取len个元素，组成一个新数组*/
   public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9};
       int[] arr1 = getArr(arr, 3, 4);
       System.out.println(Arrays.toString(arr1));

   }
   public static int[] getArr(int[] arr, int off, int len){
       int[] temp = new int[len];
       int y = 0;
       for (int i = off; i < off +len; i++) {
           temp[y] = arr[i];
           y++;
       }
       return temp;
   }
}
