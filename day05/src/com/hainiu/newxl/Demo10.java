package com.hainiu.newxl;

import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
        String str = "11 22   33  44     55";
        String[] split = str.split("\\s+");
        System.out.println(Arrays.toString(split));
    }
}
