package com.hainiu.newlx;

public class Demo05 {
    //5、二维数组遍历，求年度营业额
    public static void main(String[] args) {
        int[][] arr = {{12, 13, 14}, {30, 40, 50}, {25, 35, 45}, {10, 8, 9}};
        int year = 0;
        for (int i = 0; i < arr.length; i++) {
            int season = 0;
            for (int j = 0; j < arr[i].length; j++) {
                season += arr[i][j];
            }
            System.out.println("第" + (i + 1) + "季度的营业额为：" + season);
            year += season;
        }
        System.out.println("年度营业额为：" + year);
    }
}
