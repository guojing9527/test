package com.hainiu;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println("----");
        }
        int[] arr1 = {1,3,4,9,4,10,19};
        int[] arr2 = {2,1,7,8,5,6};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            arr3[i] = num;
        }
        for (int i = 0; i < arr2.length; i++) {
            int num = arr2[i];
            arr3[i + arr1.length] = num;
        }
        System.out.println(Arrays.toString(arr3));
        if (arr3.length % 2 == 0){
            int x = arr3[(arr3.length/2) - 1 ];
            System.out.println(x);
            int y = arr3[arr3.length/2];
            System.out.println(y);
        }else{
            int z = arr3[arr3.length/2];
            System.out.println(z);
        }

    }
}
