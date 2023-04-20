package com.hainiu.zu;

public class Demo05 {
    public static void main(String[] args) {
        int[] arr = {1,3,3,5,6,7,3,9};
        int a = 3 ;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a ){
                index = i;
                break;
            }
        }
        System.out.println(index);


    }
}
