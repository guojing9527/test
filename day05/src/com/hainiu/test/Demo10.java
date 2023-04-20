package com.hainiu.test;

import java.util.Random;

public class Demo10 {
    //    数组中随机选取元素
    public static void main(String[] args) {
        /*int[] arr = {100, 200, 500, 800, 1000};
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        System.out.println(arr[index]);*/
        int[] arr = {100, 200, 500, 800, 1000};
        Random rand = new Random();
        int count = 0;
        while ( count < arr.length ){
            int index = rand.nextInt(arr.length);
            if (arr[index] == 0){
                continue;
            }
            System.out.println("第"+(count+1)+"次抽奖是："+arr[index]);
            arr[index] = 0;
            count++;
        }
    }
}
