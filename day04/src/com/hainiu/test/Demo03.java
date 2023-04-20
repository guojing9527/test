package com.hainiu.test;

import java.io.PipedWriter;
import java.util.Scanner;

public class Demo03 {
    /*3、假设某个比赛有6个评委打分，分数范围是（0-10），
    去掉一个最低分，去掉一个最高分，取平均分作为该选手的最终得分。*/
    public static void main(String[] args) {
        int pw = 6;
        int[] arr = new int[pw];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的成绩");
            int score = sc.nextInt();
            if (score >0 && score <=10) {
                arr[i] = score;
            } else {
                System.out.println("录入有误，请重新录入");
                i--;
            }
        }
        int all = getAll(arr);
        int max = getMax(arr);
        int min = getMin(arr);
        double avg =( all - max - min ) * 1.0 / (pw -2);
        System.out.println(avg);
    }

    public static int getAll (int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int getMax (int[]arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin (int[]arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
