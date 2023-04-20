package com.hainiu.test;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo03 {
    /*三、请通过键盘录入一段纯英文文本（无需校验数据的正确性，按要求录入即可），统计其中每个英文字符出现的次数，打印结果如下：
    a=5
    b=6
    c=7
            ...
    表示a出现5次，b出现6次，以此类推；要求按照字母的自然顺序输出。*/
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        TreeMap h = new TreeMap();
        // 遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (cr(c)){
                if (h.containsKey(c)) {
                    h.put(c, (int)h.get(c) + 1);
                } else {
                    h.put(c, 1);
                }
            }
        }
        // 打印结果
       h.forEach((k,v) -> System.out.println(k + "=" + v));
    }
    public static boolean cr (char c){
        if ((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')){
            return true;
        }
        return false;
    }
}
