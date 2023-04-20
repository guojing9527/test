package com.hainiu.fuxi;

import java.util.Arrays;
import java.util.Random;

public class Demo02 {
  /*  生成了 N个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，
    然后再把这些数从小到大排序，按照排好的顺序输出。*/

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length ; i++) {
            int sj = rand.nextInt(10) + 1;
         arr [i] = sj;
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i +1; j < arr.length; j++) {
                if (temp == arr[j]){
                    arr[j] = 0;
                }
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
