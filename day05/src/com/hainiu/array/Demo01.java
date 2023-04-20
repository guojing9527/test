package com.hainiu.array;

import java.time.Year;
import java.util.SortedMap;

public class Demo01 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int year = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+(i+1)+"季度的成绩：");
            int season = 0;
            for (int j = 0; j < arr[i].length; j++) {
                season += arr[i][j];
            }
            year += season;
            System.out.println(season);
        }
        System.out.println("所有季度的总成绩："+year);
    }
}
