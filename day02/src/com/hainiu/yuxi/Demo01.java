package com.hainiu.yuxi;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //六个评委打分，去一个最大值，再去一个最小值，其余求平均值
        //键盘录入
        Scanner sc = new Scanner(System.in);
//        数组存储
        int len = 6;
        int [] arr = new int[len];
//        循环录入
        for (int i = 0; i < len; i++) {
            System.out.println("请输入第" + (i+1) +"个评委的成绩");
            int score = sc.nextInt();
             //判断
            if (score >= 0 && score <= 10){
                arr[i] = score;

            }else{
                System.out.println("录入有误请从新录入:");
                i--;
            }

        }
//        求和
        int sum = sum(arr);
//        求最大值
        int max = max(arr);
//        求最小值
        int min = min(arr);
//        输出结果
        double avg =(sum - max - min) * 1.0 /(len - 2);
        System.out.println(avg);
    }
    public static int max(int[]arr){
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max =arr[i];
            }
        }
        return max;
    }
    public static int min(int[]arr){
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min =arr[i];
            }
        }
        return min;
    }
    public static int sum(int[]arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
