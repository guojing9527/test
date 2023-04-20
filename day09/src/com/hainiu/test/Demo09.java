package com.hainiu.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo09 {
    /*10、实现日期对象和字符串之间的相互转换
        格式化 format     解析 parse*/
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);
        String str = "2000-12-12 00:00:00";
        SimpleDateFormat parse = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        Date p = parse.parse(str);
        System.out.println(p);

    }
}
