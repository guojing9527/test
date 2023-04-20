package com.hainiu.newxl;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo07 {
    /*8、完成Date对象和字符串的互换
            SimpleDateFormat*/
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String f1 = f.format(date);
        System.out.println(f1);
        String f2 = "2020-12-12 12:12:12";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = format.parse(f2);
        System.out.println(parse);
    }
}
