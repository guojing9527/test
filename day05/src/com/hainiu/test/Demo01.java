package com.hainiu.test;

public class Demo01 {
    /*1、某商场一年的销售额（单位：万元）如下：
    春季：10 11 15
    夏季：30 35 20
    秋季：9  8  10
    冬季：55 66 44
    请使用二维数组相关知识，统计该商场每个季度的营业额和年度总营业额*/
    public static void main(String[] args) {
        int[][] arr = {{10,11,15},{30,35,20},{9,8,10},{55,66,44}};
        int year = 0;
        for (int i = 0; i < arr.length; i++) {
            int season = 0;
            for (int j = 0; j < arr[i].length; j++) {
               season += arr[i][j];
            }
            System.out.println("第"+(i+1)+"季度的营业额:"+season);
            year += season;
        }
        System.out.println("年度总营业额:"+year);
    }

}
