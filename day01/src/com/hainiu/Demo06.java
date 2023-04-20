package com.hainiu;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        Demo05 d = new Demo05();
        d.setName("李白");
        d.setAge(19);
        System.out.println(d.getAge());
        System.out.println(d.getName());
        int[] arr1 = {1,4,9};
        int[] arr2 = {2,4,6,7};
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
            System.out.println(arr3[arr3.length/2]);
            System.out.println(arr3[(arr3.length/2) - 1]);
        }else {
            System.out.println(arr3[arr3.length/2]);
        }
    }
}
