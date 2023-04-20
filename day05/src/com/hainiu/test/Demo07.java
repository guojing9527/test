package com.hainiu.test;

public class Demo07 {
    public static void main(String[] args) {
        int ht = ht(5);
        System.out.println(ht);
    }
//    汉诺塔
    public static int ht(int n ){
        if (n == 1){
            return 1;
        }
        return ht(n-1)*2 +1;
    }
}
