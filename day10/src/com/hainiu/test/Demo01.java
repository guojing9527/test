package com.hainiu.test;

public class Demo01 {
    public static void main(String[] args) {
        for (int i = 2; i <= 999; i++) {
            if (su(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean su (int num){
        if (num < 2){
            return false;
        }
        int s = 2;
        int sqrt =(int) Math.sqrt(num);
        while (s <= sqrt){
            if (num % s == 0){
                return false;
            }
            s++;
        }
        return true;
    }
}
