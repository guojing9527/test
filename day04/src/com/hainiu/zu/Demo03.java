package com.hainiu.zu;

public class Demo03 {
    public static void main(String[] args) {

        int[] arr = {1,4,7,12,76,23,9,33};
        //定义变量确定0索引所在位置上的数据
        int max = arr[0];
        //循环
        for (int i = 0; i < arr.length; i++) {
            //判断
            if (arr[i] > max){
                //把大的值赋予max
                max = arr[i];
            }
        }
        System.out.println(max);//输出结果
    }
}
