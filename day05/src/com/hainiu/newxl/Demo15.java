package com.hainiu.newxl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo15 {
    public static void main(String[] args) {
        /*1、一段很长的文本：
        查找符合要求（是英文字母或者空格）的连续子串，最长的那个。

        sdfsdafsad!@#$SADFSDAF!@#$231sadfsadf123123sadf1234hello world

        记录找到的每个子串，与之前找到的比较*/
        String str = "sdfsdafsad!@#$SADFSDAF!@#$31sadfsadf123123sadf1234hello world";
        String end = "";
//        String temp = "";
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isCode(c)) {
//                temp += c;
                temp.append(c);
            } else {
                if (temp.length() > end.length()) {
                    end = temp.toString();
                }
//                temp= "";
                temp.delete(0, temp.length());
            }
        }
      /*  if (temp.length() > end.length()) {
            end = temp;
        }*/
        if (isCode(str.charAt(str.length() - 1))){
            if (temp.length() > end.length()) {
                end = temp.toString();
            }
        }
            System.out.println(end);
    }

    public static boolean isCode(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == 32;
    }
}
