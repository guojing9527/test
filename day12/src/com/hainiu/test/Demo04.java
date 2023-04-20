package com.hainiu.test;

import java.util.Enumeration;
import java.util.Properties;

public class Demo04 {
    //    5、使用Properties集合读取和写入属性信息
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("name", "hainiu");
        props.setProperty("age", "18");
        /*System.out.println(props.getProperty("name"));
        String age = props.getProperty("age");
        System.out.println(age);*/
        props.forEach((k,v) -> System.out.println(k + "=" + v));
        Enumeration<?> propertyNames = props.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String key = (String) propertyNames.nextElement();
            String value = props.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }
}
