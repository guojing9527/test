package com.hainiu.test;

public class Demo08 {
    /*8、Math实现判断素数，（查找1000以内所有的素数）*/
    public static void main(String[] args) {
        int num = 7;
        boolean ss = suShu(num);
        System.out.println(ss);
    }
    public static boolean suShu (int num){
        int temp =(int) Math.sqrt(num);
        if (num < 2){
            return false;
        }
        int a = 2;
        while (a <= temp){
            if (num % a == 0){
                return false;
            }
            a++;
        }
        return true;
    }
}
