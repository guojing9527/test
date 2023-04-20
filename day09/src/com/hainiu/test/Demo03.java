package com.hainiu.test;

public class Demo03 {
    //    3、统计一段文本中的某个单词出现的次数，参见stringdemo Demo06
    public static void main(String[] args) {
        String str = "hellojavaworldjavabigjavadatajavajava";
        String key = "java";
        int s = search(str, key);
        System.out.println(s);
    }
    public static int search(String str ,String key){
        int count = 0;
        while (true){
            int index = str.indexOf(key);
            if (index != -1){
               count++;
               str = str.substring(index + key.length());
            }else {
                break;
            }
        }
        return count;
    }
}
