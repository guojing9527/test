package com.hainiu.loop;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入成绩：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                System.out.println("ok");
                break;
            }else {
                System.out.println("录入有误,请重新录入：");
            }
        }
    }
}
