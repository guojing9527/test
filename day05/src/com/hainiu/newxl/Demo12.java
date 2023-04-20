package com.hainiu.newxl;

public class Demo12 {
    public static void main(String[] args) {
        String s = "我..我....我.我...我.要.要...要...要..要...要.学..学.学...学.学.编...编.编..编...";
        s = s.replaceAll("\\.", "");
        s = s.replaceAll("(.)\\1+", "$1");
        System.out.println(s);
    }
}
