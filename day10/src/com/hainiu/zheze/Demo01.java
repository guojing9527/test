package com.hainiu.zheze;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class Demo01 {
    public static void main(String[] args) {
        String s = "T\\s*M\\s*D";
        String str = "你T   MD,别送了，都TMD让你送起来了";
        String s1 = str.replaceAll(s, "***");
        System.out.println(s1);

    }
}
