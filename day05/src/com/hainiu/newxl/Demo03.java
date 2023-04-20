package com.hainiu.newxl;

public class Demo03 {
    /**
     * 4、String str = "hellojavaworldjavabigdatajavajava"; 有几个java单词
     * 查找并截取
     * 改变查询范围 不截取
     */
    public static void main(String[] args) {
        String str = "hellojavaworldjavabigdatajavajava";
        int count = 0;
      // 方法一：
        /* while (true){
           int i = str.indexOf("java");
           if (i != -1){
           str = str.substring(i + 4);
           count++;
           }else {
               break;
           }
       }
        System.out.println(count);*/
        // 方法二：
        int temp = 0;
        while (true) {
            int i = str.indexOf("java", temp);
            if (i != -1) {
                temp = i + 4;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
