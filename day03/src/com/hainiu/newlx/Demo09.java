package com.hainiu.newlx;

import java.util.Arrays;
import java.util.Scanner;

public class Demo09 {
    /*b、观察发现，原数组中的元素是按照升序排序的，请重新实现上述第一问中的需求，
    保证元素应添加到合适的位置，使得数组中的数据仍然保持升序。*/
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr1 = new int[arr.length + 1];
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = sc.nextInt();
        int temp = 0;
        for (int j = 0; j < arr.length; j++) {
            if(i > arr[j]){
               temp ++;
               /*temp = j*/
               arr1[j] = arr[j];
            }else {
                arr1[j+1] = arr[j];
            }
        }
       /* for (int k = 0; k <= temp; k++) {
            arr1[k] = arr [k];
        }*/
        arr1[temp] = i;
        /*arr1[temp+1] = i*/
        /*for (int q = temp+2; q < arr1.length; q++) {
            arr1[q] = arr[q - 1];
        }*/
        System.out.println(Arrays.toString(arr1));
    }
}
