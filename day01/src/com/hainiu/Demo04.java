package com.hainiu;

public class Demo04 {
    public static void main(String[] args) {
        int [][] arr = {{12,1,2},{3,4,5},{6,7,8},{9,10,11}};
        int all = 0;
        for (int i = 0; i < arr.length; i++) {
            int season = 0;
            for (int j = 0; j < arr[i].length; j++) {
             all +=  arr[i][j];
             season += arr[i][j];
            }
            System.out.println(season);
        }
        System.out.println(all);
    }

}
