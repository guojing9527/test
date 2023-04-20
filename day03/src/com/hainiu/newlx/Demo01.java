package com.hainiu.newlx;

import java.util.Scanner;

public class Demo01 {
//    1、评委打分案例（求最值 求和）
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入" + (i + 1) + "个评委的成绩");
            int temp = sc.nextInt();
            if (temp <=10 && temp >= 0){
                arr[i] = temp;
            }else {
                System.out.println("成绩有误，请重新输入：");
                i--;
            }

        }
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
        double avg = (sum - max - min) * 1.0 / (arr.length - 2);
        System.out.println(avg);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
