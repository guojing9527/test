package com.hainiu.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZhengZe4 {

    public static void main(String[] args) {
        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
        Pattern pattern = Pattern.compile("1[3|4-9]\\d{9}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            String group = matcher.group();
            System.out.println(group);
        }
    }
}