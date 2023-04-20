package com.hainiu.fuxi;

public class Demo04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int y = i % 10;
            if (y == 3 || y== 5 || y == 7){
                continue;
            }
            System.out.println(i);
        }
    }
}
