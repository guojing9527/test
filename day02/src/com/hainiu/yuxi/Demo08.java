package com.hainiu.yuxi;

import java.util.Scanner;

public class Demo08 {
   /* 接收用户输入的邮箱名，获取邮箱的名字
    比如：cxy@163.com,输出cxy*/
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入邮箱名：");
       String s = sc.nextLine();
       String name = getName(s);
       System.out.println(name);

   }
   public static String getName (String email){
       int i = email.indexOf('@');
       if (i == -1){
           return "邮箱格式错误";
       }
       return email.substring(0,i);
   }
}
