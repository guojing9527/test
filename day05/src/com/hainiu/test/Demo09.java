package com.hainiu.test;

public class Demo09 {
    public static void main(String[] args) {
        int mg = mg(0, 0);
        System.out.println(mg);

    }
//    走迷宫
    public static int mg (int a, int b){
        if (a == 5 || b == 5){
            return 1;
        }
        return mg(a,b+1)+mg(a+1,b);
    }
}
