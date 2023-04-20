package com.hainiu.newxl;

import java.util.Arrays;

public class Demo14 {
    public static void main(String[] args) {
        /*11、String s = "11 110   20  25  18  17  15  22"
        将其中的整数按照大小排序（Arrays.sort()）,组成一个新的字符串。
        拆分成字符串数组
                字符串数组转换为整数数组
        排序
        再把整数数组拼接成字符串（StringBuilder）*/
        String s ="11 110   20  25  18  17  15  22";
        String[] split = s.split("\\s+");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
           sb = sb.append(arr[i]);
           sb = sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
