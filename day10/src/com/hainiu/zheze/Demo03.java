package com.hainiu.zheze;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03 {
    public static void main(String[] args) {
        //运行时异常
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        //编译时异常
        String str = "2020-02-02";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-DD");
        Date date =null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }
}
